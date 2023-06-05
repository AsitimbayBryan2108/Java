package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;  

public class Layout3 extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage) {
    
    	    primaryStage.setTitle("HBox");
    	    Button btn1 = new Button("Boton 1");
    		Button btn2 = new Button("Boton 2");	
    		Button btn3 = new Button("Boton 3");
    		Button btn4 = new Button("Boton 4");
    		
            HBox HBox = new HBox();
            Scene sc = new Scene(HBox,400,200);
        	HBox.getChildren().addAll(btn1,btn2,btn3,btn4);
	
            primaryStage.setScene(sc);
            primaryStage.show();

            
    }

    
}
