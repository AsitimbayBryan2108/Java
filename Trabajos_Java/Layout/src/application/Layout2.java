package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class Layout2 extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage){
            primaryStage.setTitle("BorderPane");
		
            BorderPane BorPa = new BorderPane();
            BorPa.setTop( new Button("Top"));
            BorPa.setBottom(new Button("Bottom"));
            BorPa.setCenter(new Button("Center"));
            BorPa.setLeft(new Button("Left")); 
            BorPa.setRight(new Button("Right")); 	
            Scene sc = new Scene(BorPa,400,300);
            primaryStage.setScene(sc);
            primaryStage.show();

          
            

    }

    
}