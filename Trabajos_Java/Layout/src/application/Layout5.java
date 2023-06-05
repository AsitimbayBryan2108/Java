package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class Layout5 extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage){
		
    	primaryStage.setTitle("GridPane");
    	 	Button btn = new Button("Boton 1");
            Label lb = new Label("Texto: ");
            TextField TextF = new TextField();
            GridPane GridPane = new GridPane();
		
            GridPane.add(TextF,1,1 );
            GridPane.add(btn,2,1 );
            GridPane.add(lb,2,3 );
            
		
            Scene sc = new Scene(GridPane,225,100);
            primaryStage.setScene(sc);
            primaryStage.show();

            
    }
	

}
