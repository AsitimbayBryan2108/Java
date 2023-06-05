package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class Test extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage){
		
    	primaryStage.setTitle("Examen Practico Primer Parcial");
    	 	Button btn1 = new Button("Boton 1");
    	 	Button btn2 = new Button("Boton 2");
    	 	Button btn3 = new Button("Boton 3");
    	 	Button btn4 = new Button("Boton 4");
            Label lb1 = new Label("No cuentes los días, \nhaz que los días cuenten. ");
            Label lb2 = new Label("El amor no tiene cura,\npero es la cura para todos los males. ");
            Label lb3 = new Label("El mejor momento \ndel día es ahora.");
            Label lb4 = new Label("Sé el cambio que \nquieres ver en el mundo.");

            GridPane GridPane = new GridPane();
		
            GridPane.add(lb1,1,1 );
            GridPane.add(lb2,2,3 );
            GridPane.add(lb3,1,4 );
            GridPane.add(lb4,2,5 );
            
            GridPane.add(btn1,2,1 );     
            GridPane.add(btn2,1,3 );
            GridPane.add(btn3,2,4 );
            GridPane.add(btn4,1,5 );
            
           
            Scene sc = new Scene(GridPane,350,200);
            primaryStage.setScene(sc);
            primaryStage.show();
           


            
    }
	

}

