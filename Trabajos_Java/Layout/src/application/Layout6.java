package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

public class Layout6 extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage){
    	
    	primaryStage.setTitle("TilePane");


            Label primero = new Label("label 1");
            primero.setPrefSize(200, 100);
            Label segundo = new Label("label 2");
            segundo.setPrefSize(200, 100);
            Label tercero = new Label("label 3");
            tercero.setPrefSize(200, 100);
            Label cuarto = new Label("label 4");
            cuarto.setPrefSize(200, 100);
            
            
            
            TilePane tilePane = new TilePane(); 
            tilePane.setOrientation(Orientation.HORIZONTAL);
            tilePane.setTileAlignment(Pos.CENTER_LEFT);
	    
            tilePane.setPrefRows(3);
            ObservableList list = tilePane.getChildren();
	    
            list.addAll(primero,segundo,tercero,cuarto);

            Scene sc = new Scene(tilePane,500,200);
	
            primaryStage.setScene(sc);
            primaryStage.show();

    }
    

    
}
