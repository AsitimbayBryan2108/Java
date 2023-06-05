import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Examen extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }


public void start(Stage arg1) throws Exception{

    AnchorPane si = new AnchorPane();
    HBox hbox1 = new HBox(10);
    BorderPane borderpane1 = new BorderPane();
    borderpane1.setTop(hbox1);
    
    Button b1 = new Button("Boton1");
    Button b2 = new Button("Boton2");

    b1.setPrefSize(170, 30);
    b2.setPrefSize(170, 30);
    
    //hbox1.setAlignment(Pos.CENTER);
    hbox1.setAlignment(Pos.TOP_CENTER);
    hbox1.getChildren().addAll(b1,b2);
    hbox1.setPrefSize(200, 200);
    hbox1.setBorder(Border.stroke(Color.BLACK));
    si.getChildren().add(borderpane1);
    AnchorPane.setBottomAnchor(borderpane1, 0.00);
    AnchorPane.setTopAnchor(borderpane1,0.00);
    AnchorPane.setLeftAnchor(borderpane1, 0.00);
    AnchorPane.setRightAnchor(borderpane1,0.00);
    

    Scene scene1 = new Scene(si, 400, 400);
    arg1.setTitle("EXAMEN");
    arg1.setScene(scene1);
    arg0.show();
   }
}