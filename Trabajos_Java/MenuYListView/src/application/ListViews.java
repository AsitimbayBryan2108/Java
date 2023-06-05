package application;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ListViews extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        Button btn1 = new Button("Aceptar");
     
        AnchorPane root = new AnchorPane(btn1);
        Scene escena = new Scene(root,450,450);
        FlowPane flowPane = new FlowPane(Orientation.HORIZONTAL);      
        
        ListView<String> listView = new ListView<String>(FXCollections.observableArrayList("Pepperoni","Champiñones","Cebolla","Salchicha","Tocino","Extra queso","Aceitunas negras","Pimientos verdes"));
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listView.setFixedCellSize(-1);
        flowPane.getChildren().add(listView);
        root.getChildren().add(flowPane);
        
		AnchorPane.setRightAnchor(btn1,100.0);

        arg0.setTitle("Lista de Toppings");
        arg0.setScene(escena);
        arg0.show();

    }
    
}
