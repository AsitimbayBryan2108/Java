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
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class Layout8 extends Application {
	

	public static void main(String[] args) {
        launch(args);
    }
	
    public void start(Stage primaryStage)
    {
		primaryStage.setTitle("AnchorPane");

    	Button boton1 = new Button("Boton 1");
    	Button boton2 = new Button("Boton 2");
    	Button boton3 = new Button("Boton 3");

    	Label l1 = new Label("Permite mas libertad de movimiento");
		AnchorPane AnchorPane1= new AnchorPane (boton1,boton2,boton3,l1);
		
		AnchorPane.setTopAnchor (l1, 60.0);
		AnchorPane.setBottomAnchor (boton1, 40.0);
		AnchorPane.setLeftAnchor(boton2, 40.0);
		AnchorPane.setRightAnchor(boton3, 40.0);
        Scene sc = new Scene(AnchorPane1,500,300);

        
		primaryStage.setScene(sc);
		primaryStage.show();
	}
	
    
}