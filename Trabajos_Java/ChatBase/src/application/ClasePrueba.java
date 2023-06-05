package application;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;


public class ClasePrueba extends Application 
{

	@Override
	public void start(Stage arg0) throws Exception 
	{
		initUI(arg0);
	}
	

	private void initUI(Stage stage) throws FileNotFoundException 
	{
		
        
  
        // Separaciones
        Rectangle accesos = new Rectangle(50, 700, Color.LIGHTGREEN);
        Rectangle mensajes = new Rectangle(100, 700, Color.GREENYELLOW);
        Rectangle seccionchat = new Rectangle(550, 700, Color.LIGHTGREEN);
        
		Rectangle seccion = new Rectangle(300, 60, Color.LIGHTGREEN);
		
        Rectangle exploracion = new Rectangle(300, 40, Color.GREENYELLOW);
        exploracion.setArcHeight(40.0d);
        exploracion.setArcWidth(40.0d);
        
        Rectangle barra = new Rectangle(850, 60, Color.LIGHTGREEN);
        
        
        //Labels
        Label espacio1 = new Label("\n");
        Label espacio2 = new Label("\n");
        Label espacio3 = new Label("\n");
        
        Label nombreUsuario = new Label(" Usuario:");
        nombreUsuario.setFont(new Font("Calibri" ,20));
        Label chatMensaje = new Label(" Mensaje: ");
        chatMensaje.setFont(new Font("Calibri" ,18));
        Label salto = new Label("  ");
        Label salto1 = new Label("\t");
        
        
		
	
        Button boton2 = new Button("Buscar"); 
        
        //textfield
        TextField busqueda = new TextField();
    	busqueda.setMinSize(200, 20); 
		TextField caja1 = new TextField("");
		caja1.setMinSize(0, 0); 
		TextField caja2 = new TextField("");
	
        
        VBox mensajeUsuario  = new VBox();
        mensajeUsuario .getChildren().addAll(nombreUsuario, chatMensaje );
        mensajeUsuario .setAlignment(Pos.CENTER_LEFT);
		
        HBox globo = new HBox();
        globo.getChildren().addAll(salto, mensajeUsuario );
        globo.setAlignment(Pos.CENTER_LEFT);
        
        HBox cajaExploracion = new HBox();
        cajaExploracion.getChildren().addAll( salto1, busqueda);
        cajaExploracion.setAlignment(Pos.CENTER);
        
        GridPane espacio_chat = new GridPane();
        espacio_chat.add(barra, 0, 0);
        
        
        GridPane cuadroExploracion = new GridPane();
        cuadroExploracion.add(exploracion, 0, 0);
        cuadroExploracion.setAlignment(Pos.CENTER);
        
        GridPane chat = new GridPane();
        chat.add(seccion, 0, 0);
        chat.add(globo, 0, 0);
        chat.add(cuadroExploracion, 0, 1);
           
        GridPane estructura = new GridPane();
        estructura.add(accesos, 0, 0);
        estructura.add(mensajes, 2, 0);
        estructura.add(seccionchat, 2, 1000);
        estructura .add(chat, 0, 0);
        estructura.add(espacio_chat,0,0);
        
      //Boton de Enviar
        Button boton1 = new Button("Enviar"); 
        AnchorPane root1 = new AnchorPane();
		
		ScrollPane scrollPane = new ScrollPane();
		VBox vContent =new VBox();
		
		scrollPane.setContent(vContent);
		
		scrollPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		
		AnchorPane.setLeftAnchor(scrollPane, 0.0);
		AnchorPane.setRightAnchor(scrollPane, 0.0);
		AnchorPane.setTopAnchor(scrollPane, 0.0);
		AnchorPane.setBottomAnchor(scrollPane, 50.0);
		
		FlowPane flowPane = new FlowPane();
		flowPane.setPrefHeight(50);
		flowPane.setStyle("-fx-background-color: #ddd;");
//		flowPane.setPrefSize(Integer.MAX_VALUE, 50);
		Button btnSend = new Button("Send");
		btnSend.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				FlowPane fMessage = new FlowPane(10,10);
				Label lbluser = new Label("No entiendo el Programa");
				Label lblMessage = new Label("Mensaje desde el boton ");
				fMessage.getChildren().addAll(lbluser, lblMessage);
				vContent.getChildren().add(fMessage);	
			}
		});
		
		
		flowPane.getChildren().add(btnSend);
		
		AnchorPane.setBottomAnchor(flowPane, 0.0);
		AnchorPane.setLeftAnchor(flowPane, 0.0);
		AnchorPane.setRightAnchor(flowPane, 0.0);
		AnchorPane.setBottomAnchor(flowPane, 0.0);
		
		root1.getChildren().add(scrollPane);
		root1.getChildren().add(flowPane);
       
        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(caja1,boton1,boton2,estructura, barra,btnSend);
        
        AnchorPane.setTopAnchor(caja1, 470.0);
        AnchorPane.setLeftAnchor(caja1, 470.0);
        AnchorPane.setRightAnchor(caja1, 0.0);
        
        AnchorPane.setTopAnchor(btnSend, 470.0);
        AnchorPane.setLeftAnchor(btnSend, 394.0);
        AnchorPane.setRightAnchor(btnSend, 430.0);
        
        AnchorPane.setTopAnchor(barra, 0.0);
        AnchorPane.setLeftAnchor(barra, 400.0);
        AnchorPane.setRightAnchor(barra, 430.0);

        
        Scene scene = new Scene(root,900,500);
        stage.setTitle("WhatsApp");
        stage.setScene(scene);
        stage.show();
		
	}
	

	public static void main(String[] args) {
		launch(args);
	}

	

}
