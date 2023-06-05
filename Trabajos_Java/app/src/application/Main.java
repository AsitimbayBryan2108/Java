package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;

import com.chat.database.datbase;
import com.chat.domain.Mensaje;
import com.chat.domain.contacto;
import com.chat.util.MessageArrivedAction;
import com.chat.util.MqttChat;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class Main extends Application {
	MqttChat mqt = new MqttChat();
	contacto userTo = null;
	contacto perfil = null;
	datbase db = new datbase();
	List<contacto> contactos;
	
	public void seleccion_chat (GridPane root) {			
		if (userTo != null) {
				List<Mensaje> mensajes = db.get(perfil.getId_cont(), userTo.getId_cont());
							
				FlowPane chatpanel = (FlowPane)root.lookup("#idpanel");
				ScrollPane scroll = (ScrollPane)root.lookup("#idscroll");
				chatpanel.getChildren().clear();
				chatpanel.setPadding(new Insets(20, 0, 10, 10));
				
				HBox info = (HBox)root.lookup("#idinfo");
				
				for(int j = 0; j < mensajes.size(); j++) {

					HBox mensaje = new HBox(10);
					mensaje.setPrefWidth(chatpanel.getWidth()-20);
					Label msj = new Label(mensajes.get(j).getContent());
						
						msj.setTextAlignment(TextAlignment.JUSTIFY);
						msj.setWrapText(true);
						msj.setMaxWidth(350);
						msj.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 12));
						msj.setStyle("-fx-background-color: rgb(24,255,16); -fx-background-radius: 8px;");
						msj.setPadding(new Insets(6));
					

					if ((mensajes.get(j).get_idFrom()!=perfil.getId_cont())) {
						msj.setStyle("-fx-background-color:#82ccdd");
						mensaje.setStyle("-fx-background-color: #60a3bc");
						mensaje.setAlignment(Pos.TOP_LEFT);

					} else {
						
						msj.setStyle("-fx-background-color:#82ccdd");
						mensaje.setStyle("-fx-background-color: #60a3bc");
						mensaje.setAlignment(Pos.TOP_RIGHT);
							
					}
					
						mensaje.getChildren().addAll( msj);
						////mensaje.setPrefWidth(605);
						mensaje.setPadding(new Insets(20, 0, 10, 10));
						chatpanel.getChildren().add(mensaje);
						scroll.vvalueProperty().bind(mensaje.heightProperty());
						
					}
				//panel info contacto
			     
			      Label nombre = new Label(userTo.getNombre());
			      nombre.setFont(new Font(20));
			      
			      String textoEstado="";
			      
			      if (userTo.getEstado()){
			    	  textoEstado="⚫ activo";
			      }else {
			    	  textoEstado="⭕ ausente";
			      }
			     
			      Label estado =new Label(textoEstado);
			      info.getChildren().clear();
			      info.getChildren().addAll(nombre,estado);
			      
			      
			      info.setAlignment(Pos.CENTER_LEFT);
			      info.setPadding(new Insets(10));
				}
   }
		
	
	public void updateContacts(ListView listView, contacto myContact) {
		//contactos = db.getContact(perfil.getId_cont());
		contacto c = myContact;
		for(int i = 0; i < listView.getItems().size(); i++)
		{	
			contacto item = (contacto) listView.getItems().get(i);
			item.setEstado(true);
			if(item.getUserName().equals(c.getUserName()) && item.getNombre().equals(c.getNombre())) {
				listView.getItems().remove(i);
				listView.getItems().add(0, c);	
				if (!listView.getItems().isEmpty()) {
				    listView.getSelectionModel().select(0);
				}
				System.out.println("Encontrado en la posición:" + i);
				break;
			}
		}
	}
	
	public void updateContacts(ListView listView, int myContact) {
		for(int i = 0; i < contactos.size(); i++)
		{	
			contacto item = contactos.get(i);
			if(item.getId_cont() == myContact) {
				updateContacts(listView, item);
				break;
			}
		}
	}
		
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//imagen de acceso
			HBox imagen =new HBox(10);
			Image image = new Image("https://dwakq6hcp77cr.cloudfront.net/wp-content/uploads/2021/11/22091458/Apps-for-Android-and-iPhone.png", 200, 200, false, false);	
		       ImageView logo = new ImageView();
				logo.setImage(image);
				logo.setX(100);
			imagen.setAlignment(Pos.CENTER);
			imagen.getChildren().addAll(logo);	
				
			//campos de usuario
			HBox usuario = new HBox(10);
			Label label1 =  new Label("usuario");
			label1.setText("USUARIO  :        ");
			TextField tf =  new TextField( );
			usuario.getChildren().addAll(label1,tf);
			
			//campos de contraseña
			HBox contra = new HBox(10);
			//contra.setAlignment(Pos.BASELINE_CENTER);
			Label label2 =  new Label();
			label2.setText("CONTRASEÑA : ");
			PasswordField  ps=  new PasswordField();
			contra.getChildren().addAll(label2,ps);
			
			//boton inicio
			HBox btnlogin= new HBox(10);
			btnlogin.setAlignment(Pos.CENTER);
			Button inicio = new Button("Iniciar Sesion");
			btnlogin.getChildren().addAll(inicio);
			
			inicio.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					perfil = db.checkLogin(tf.getText(),ps.getText());	
					
					if (perfil == null) {					
						ps.setText("");
						tf.setText("");
	
					}else { 
						db.updateState(perfil.getId_cont(), true);
					
						GridPane root = new GridPane();		
						
				root.setStyle("-fx-background-color:#82ccddb");
				//
				
				ColumnConstraints column1 = new ColumnConstraints(); column1.setPercentWidth(30); 
				ColumnConstraints column2 = new ColumnConstraints(); column2.setPercentWidth(70);
				root.getColumnConstraints().addAll(column1, column2);
				
				RowConstraints row1 = new RowConstraints(); row1.setPercentHeight(10);
				RowConstraints row2 = new RowConstraints(); row2.setPercentHeight(80);
				RowConstraints row3 = new RowConstraints(); row3.setPercentHeight(10);
				root.getRowConstraints().addAll(row1,row2,row3);

				contactos = db.getContact(perfil.getId_cont());
				ObservableList<contacto> names = FXCollections.observableArrayList(contactos);
		        ListView<contacto> listView = new ListView<>(names);
		        listView.setCellFactory(param -> new ListCell<contacto>() {
					@Override
				    protected void updateItem(contacto item, boolean empty) {
				        super.updateItem(item, empty);

				        if (empty || item == null) {
				            setText(null);
				        } else {
				        	setPrefHeight(80);
				        	Image fondox1 = new Image(item.getImage());
							setGraphic(new Circle(30, new ImagePattern(fondox1)));
							
							Mensaje mensaje=db.getLastMsg(perfil.getId_cont(), item.getId_cont());
							setText(item.getNombre()+"\t\t\t"+mensaje.getDate()+"\n"+mensaje.getContent());
				        }
				    }
				});
		        
		            
		        //BOTON ENVIAR
		        Button enviar = new Button("enviar");
		        TextField mensaje_actual =  new TextField();
		        mensaje_actual.setPrefWidth(600);
		        enviar.setOnAction(new EventHandler<ActionEvent>() {
		        	
		        	@Override
					public void handle(ActionEvent arg0) {
		        		if (userTo != null && !mensaje_actual.getText().isEmpty()) {
		    				String content =  mensaje_actual.getText();
		    				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");		    			
		    				Mensaje newMessage = new Mensaje(perfil.getId_cont(), userTo.getId_cont(), content, LocalDateTime.now().format(formatter).toString());
		    				mensaje_actual.setText("");
	    					db.add(newMessage);
		    				try {
		    					/////////////////////////////////////////
		    					/// envia msg
		    					/////////////////////////////////////////
		    					System.out.println(newMessage);
		    					mqt.sendMessage(userTo.getUserName(), newMessage);
		    					seleccion_chat(root);
		    				
		    					updateContacts(listView, userTo);
		    					
								
		    				} catch (MqttPersistenceException e1) {
		    					e1.printStackTrace();
		    				} catch (MqttException e1) {
		    					e1.printStackTrace();
		    				}		        		
		    			}
		 
		        }
		    });
		        

		        
		        //panel enviar
		        HBox panelenviar= new HBox(10) ;
			    panelenviar.getChildren().addAll(mensaje_actual,enviar);
			    panelenviar.setAlignment(Pos.CENTER_RIGHT);
			    panelenviar.setPadding(new Insets(10));
			    panelenviar.setStyle("-fx-background-color:#82ccdd");
	  
			    ScrollPane scroll =new ScrollPane();
			    scroll.setId("idscroll");
			    FlowPane chatpanel = new FlowPane();
			    chatpanel.setId("idpanel");
			    
				 try {
						mqt.connect(perfil);
						mqt.subscribe(perfil.getUserName());
						mqt.messageArrived(new MessageArrivedAction() {
							
							@Override
							public void messageArrived(String topic, Mensaje message) {
								/////////////////////////////////////////
								/// reciben los msg
								/////////////////////////////////////////
								
								Platform.runLater(new Runnable(){
										
									@Override
									public void run() {
										try{
											seleccion_chat(root);	
											
											updateContacts(listView, message.get_idFrom());
										}catch (Exception e) {
											System.out.println(e.getMessage());
															}
										}
								});
											
							}
						});
													
					} catch (MqttException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
			    
			    HBox info = new HBox(20);
			    info.setId("idinfo");
			    
			    info.setStyle("-fx-background-color:#82ccdd");
			    chatpanel.setPrefHeight(500);
			    chatpanel.setPrefWidth(750);
			    scroll.setFitToWidth(true);
			    scroll.setPrefViewportHeight(500);
			    scroll.setPadding(new Insets(0));
			    scroll.setContent(chatpanel);
			    scroll.widthProperty().addListener((o) -> {
			        Node vp = root.lookup(".viewport");
			        vp.setStyle("-fx-background-color:#60a3bc");
			    });
			    
			    
			    listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<contacto>() {

					@Override
					public void changed(ObservableValue<? extends contacto> arg0, contacto arg1, contacto arg2) {
						userTo = arg2;
						seleccion_chat(root);
					}
					});

			    

				//panel buscar
			    	
				  Image imageBuscador = new Image(perfil.getImage(),60,50,false,false);
				  ImageView logobuscar = new ImageView();
				  logobuscar.setImage(imageBuscador);
					
				
				  TextField buscador =  new TextField("Busca un chat o inicia uno nuevo");
				  buscador.setLayoutX(120);
			      buscador.setLayoutY(20);
			      buscador.setAlignment(Pos.CENTER);
			      HBox buscar =new HBox(35);
			      buscar.setAlignment(Pos.CENTER);
			      buscar.getChildren().addAll(logobuscar,buscador);
			      buscar.setStyle("-fx-background-color:#60a3bc"); 
			      root.setStyle("-fx-background-color:#60a3bc");
			     
			  
				
				 //AÑADIR AL GRIDPANEL
			      root.add(buscar, 0, 0) ;
			      root.add(info,1,0);
			      root.add(listView, 0,1,1,2);
			      root.add(scroll, 1, 1);
			      root.add(panelenviar, 1, 2);
			    
		        Scene scene = new Scene(root,1000,600);
		        primaryStage.setScene(scene);
		        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
		        	@Override
		        	public void handle(WindowEvent t) {
		        		db.updateState(perfil.getId_cont(), false);
		        		Platform.exit();
		        		System.exit(0);
		        	}
		        });
		        primaryStage.show();
				
				}
				}
			});
			

			//panel general
			FlowPane rootlogin = new FlowPane(Orientation.VERTICAL);
			rootlogin.setVgap(10);
			rootlogin.setPadding(new Insets(60));
			rootlogin.setStyle("-fx-background-color:#82ccdd");
			//root.setCenterShape(true);
			rootlogin.getChildren().addAll(imagen,usuario,contra,btnlogin);
			
			Scene scene = new Scene(rootlogin,400,450);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("TU CHAT");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}