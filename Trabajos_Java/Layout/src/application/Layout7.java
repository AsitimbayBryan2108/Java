package application;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;

public class Layout7 extends Application{
	
	 public static void main(String[] args) {
	        launch(args);
	    }
    
    public void start(Stage primaryStage){
        primaryStage.setTitle("FlowPane");

        Button bt1 = new Button("Boton 1");
        Button bt2 = new Button("Boton 2");
        Button bt3 = new Button("Boton3");

        FlowPane flowpane = new FlowPane();

        flowpane.getChildren().add(bt1);
        flowpane.getChildren().add(bt2);
        flowpane.getChildren().add(bt3);

        Scene scene = new Scene(flowpane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    

}

	    


