package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class Layout4 extends Application{
	
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage){
        
	    	primaryStage.setTitle("StackPane");

            Label lb1 = new Label("Prueba 1");
            lb1.setFont(new Font(30));
           
            Rectangle rectangulo = new Rectangle(300, 200, 300, 200);
            rectangulo.setFill(Color.RED);
            Rectangle rectangulo2 = new Rectangle(200, 100, 200, 100);
            rectangulo2.setFill(Color.YELLOW);
		
            StackPane StackPane = new StackPane(rectangulo,rectangulo2, lb1);
   
            

            Scene sc = new Scene(StackPane,500,400);
            primaryStage.setScene(sc);
            primaryStage.show();

    }
    

}

