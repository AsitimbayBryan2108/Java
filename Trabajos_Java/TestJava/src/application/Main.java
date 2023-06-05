package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Main extends Application {
	
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage) {
	
    primaryStage.setTitle("VBox");

	Button btn1 = new Button("Boton 1");
	Button btn2 = new Button("Boton 2");	
	Button btn3 = new Button("Boton 3");
	Button btn4 = new Button("Boton 4");
	VBox vbox = new VBox();
	
    Scene sc = new Scene(vbox,300,200);
	vbox.getChildren().addAll(btn1,btn2,btn3,btn4);
        
    primaryStage.setScene(sc);
	primaryStage.show();
        
    }
}
