package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
AnchorPane root = new AnchorPane();
		
		ScrollPane scrollPane = new ScrollPane();
		VBox vContent =new VBox();
		
		scrollPane.setContent(vContent);
		
		scrollPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		
		AnchorPane.setLeftAnchor(scrollPane, 0.0);
		AnchorPane.setRightAnchor(scrollPane, 0.0);
		AnchorPane.setTopAnchor(scrollPane, 0.0);
		AnchorPane.setBottomAnchor(scrollPane, 50.0);
		
		FlowPane flowPane = new FlowPane();
		flowPane.setPrefHeight(50);
		flowPane.setStyle("-fx-background-color: #ddd;");
//		flowPane.setPrefSize(Integer.MAX_VALUE, 50);
		Button btnSend = new Button("Send");
		btnSend.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				FlowPane fMessage = new FlowPane(10,10);
				Label lbluser = new Label("No entiendo el Programa");
				Label lblMessage = new Label("Mensaje desde el boton ");
				fMessage.getChildren().addAll(lbluser, lblMessage);
				vContent.getChildren().add(fMessage);	
			}
		});
		
		
		flowPane.getChildren().add(btnSend);
		
		AnchorPane.setBottomAnchor(flowPane, 0.0);
		AnchorPane.setLeftAnchor(flowPane, 0.0);
		AnchorPane.setRightAnchor(flowPane, 0.0);
		AnchorPane.setBottomAnchor(flowPane, 0.0);
		
		root.getChildren().add(scrollPane);
		root.getChildren().add(flowPane);
		
		Scene scene = new Scene(root, 551, 201);
		primaryStage.setScene(scene);
		//showing the output
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
