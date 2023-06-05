package application;

import java.io.FileNotFoundException;
import java.time.LocalTime;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class WhatsappPlus extends Application {

	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {

		AnchorPane root = new AnchorPane();

		ScrollPane scrollPane = new ScrollPane();
		VBox vContent = new VBox(10);

		scrollPane.setContent(vContent);
		scrollPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		scrollPane.setStyle(
				"-fx-background-image: url('Jeto.jpeg'); -fx-background-repeat: stretch;-fx-background-size: AUTO AUTO; -fx-background-position: center center;");

		AnchorPane.setLeftAnchor(scrollPane, 0.0);
		AnchorPane.setRightAnchor(scrollPane, 0.0);
		AnchorPane.setTopAnchor(scrollPane, 0.0);
		AnchorPane.setBottomAnchor(scrollPane, 50.0);

		FlowPane flowPane = new FlowPane();
		flowPane.setPrefHeight(50);
		flowPane.setStyle("-fx-background-color: #ddd;");
		// flowPane.setPrefSize(Integer.MAX_VALUE, 50);
		Image imgSend = new Image(("buttonSend.png"));
		ImageView img2 = new ImageView(imgSend);
		img2.setFitHeight(18);
		img2.setFitWidth(25);
		Button btnSend = new Button("", img2);
		TextField txtIngreso = new javafx.scene.control.TextField();
		txtIngreso.setPrefSize(500, 25);

		btnSend.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				mandarMensaje(txtIngreso, vContent);
			}
		});

		txtIngreso.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent arg0) {
				if (arg0.getCode().equals(KeyCode.ENTER)) {

					mandarMensaje(txtIngreso, vContent);

				}

			}

		});

		flowPane.getChildren().addAll(btnSend, txtIngreso);

		AnchorPane.setBottomAnchor(flowPane, 0.0);
		AnchorPane.setLeftAnchor(flowPane, 0.0);
		AnchorPane.setRightAnchor(flowPane, 0.0);
		AnchorPane.setBottomAnchor(flowPane, 0.0);

		root.getChildren().add(scrollPane);
		root.getChildren().add(flowPane);

		Scene scene = new Scene(root, 551, 201);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Chat");
		// showing the output
		primaryStage.show();
	}

	public void mandarMensaje(TextField txtIngreso, VBox vContent) {

		AnchorPane fMessage = new AnchorPane();
		Label lblUser = new Label();
		lblUser.setWrapText(true);
		lblUser.setPrefWidth(200);
		lblUser.setMaxWidth(Region.USE_PREF_SIZE);
		Label lblTiempo = new Label();

		if (!(txtIngreso.getText().equals(""))) {

			lblUser.setText(" " + txtIngreso.getText());

			if (LocalTime.now().getMinute() <= 9) {

				lblTiempo.setText(" -" + LocalTime.now().getHour() + ":0" + LocalTime.now().getMinute());

			} else {

				lblTiempo.setText(" -" + LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());

			}

			txtIngreso.setText("");
			AnchorPane.setBottomAnchor(lblUser, 12.0);
			AnchorPane.setLeftAnchor(lblUser, 15.0);
			AnchorPane.setRightAnchor(lblUser, 0.0);
			AnchorPane.setTopAnchor(lblUser, 0.0);
			lblTiempo.setAlignment(Pos.BOTTOM_RIGHT);
			// lblUser.setAlignment(Pos.CENTER);
			AnchorPane.setBottomAnchor(lblTiempo, 12.0);
			AnchorPane.setLeftAnchor(lblTiempo, 0.0);
			AnchorPane.setRightAnchor(lblTiempo, 7.0);
			AnchorPane.setTopAnchor(lblTiempo, 0.0);
			lblTiempo.setTextFill(Color.WHITE);
			lblUser.setTextFill(Color.WHITE);
			fMessage.setPrefHeight(30);
			fMessage.getChildren().addAll(lblUser, lblTiempo);
			fMessage.setStyle(
					"-fx-background-color: #41BFD8; -fx-shape: 'M 70 350 C 35 245 70 175 105 140 C 210 105 350 100 450 100 C 560 105 630 105 700 150 C 735 210 735 280 700 350 C 595 420 245 420 150 350 L 70 490 L 70 350 ';");
			vContent.getChildren().add(fMessage);
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}