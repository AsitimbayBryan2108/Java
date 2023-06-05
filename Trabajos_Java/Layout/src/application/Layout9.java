package application;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;



public class Layout9 extends Application {
	
	public FlowPane getFlowPane() {
		FlowPane flowPane = new FlowPane(Orientation.VERTICAL, 1, 10);
		Button btn1 = new Button("Boton 1 FlowPane");
		Button btn2 = new Button("Boton 2 FlowPane");
		Button btn3 = new Button("Boton 3 FlowPane");
        Label lbl1 = new Label("Espacio");
		
		flowPane.getChildren().add(btn1);
		flowPane.getChildren().add(btn2);
		flowPane.getChildren().add(btn3);
		flowPane.getChildren().add(lbl1);
		
		return flowPane;
	}
	
	public BorderPane getBorderPane() {
		
		BorderPane borderPane = new BorderPane();
		
		Button btn1 = new Button("Boton 1");
		Button btn2 = new Button("Boton 2");
		Button btn3 = new Button("Boton 3");
		Button btn4 = new Button("Boton 4");
		Button btn5 = new Button("Boton 5");
		
		borderPane.setCenter(btn1);
		borderPane.setBottom(btn2);
		borderPane.setLeft(btn3);
		borderPane.setRight(btn4);
        borderPane.setTop(btn5);
		
		return borderPane;
	}
	
    public VBox getVBox(){

        Button btn1 = new Button("Boton 1");
		Button btn2 = new Button("Boton 2");
		Button btn3 = new Button("Boton 3");
		Button btn4 = new Button("Boton 4");
		Button btn5 = new Button("Boton 5");
        
        VBox vbox = new VBox(5,btn1,btn2,btn3,btn4,btn5);
        vbox.setAlignment(Pos.BASELINE_CENTER);
        return vbox;
        
    }

    public HBox getHBox(){

        Button btn1 = new Button("Boton 1");
		Button btn2 = new Button("Boton 2");
		Button btn3 = new Button("Boton 3");
		Button btn4 = new Button("Boton 4");
		Button btn5 = new Button("Boton 5");
        
        HBox hbox = new HBox(5,btn1,btn2,btn3,btn4,btn5);
        hbox.setAlignment(Pos.BASELINE_CENTER);
        return hbox;
        
    }

    public GridPane getGridPane(){

        GridPane gridpane = new GridPane();

        

        return gridpane;
    }
	@Override
	public void start(Stage primaryStage) {
		try {
			
			BorderPane root = getBorderPane();
			FlowPane root2 = getFlowPane();
            VBox root3 = getVBox();
            HBox root4 = getHBox();
			
			
			
			Scene scene = new Scene(root4,315,200);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}