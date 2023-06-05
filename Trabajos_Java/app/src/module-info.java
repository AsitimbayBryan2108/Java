module app {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.base;
	requires org.eclipse.paho.client.mqttv3;
	requires java.desktop;
	requires com.google.gson;
	requires java.sql;

	opens application to javafx.graphics, javafx.fxml;
	opens com.chat.domain to com.google.gson;
}
