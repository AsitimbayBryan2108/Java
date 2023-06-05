package com.chat.util;
///import java.time.LocalDate;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import com.chat.domain.Mensaje;
import com.chat.domain.contacto;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
public class MqttChat {
	String broker = "tcp://localhost:1883";
    MqttClient client;

    
    public MqttChat() {
    	
    }
    
    public void connect(contacto user) throws MqttException {
    	MemoryPersistence persistence = new MemoryPersistence();
    	client = new MqttClient(broker, user.getUserName(), persistence);
		MqttConnectOptions connOpts = new MqttConnectOptions();
		connOpts.setAutomaticReconnect(true);
		client.connect(connOpts);
		System.out.println("Connect OK");
    }
    
    public void subscribe(String topic) throws MqttException{
		client.subscribe(topic);
		System.out.println("Subscribe OK: " + topic);
    }
    
    public void unsubscribe(String topic) throws MqttException {
		client.unsubscribe(topic);
		System.out.println("Unsubscribe OK");
    }
    
    public void sendMessage(String topic, Mensaje message) throws MqttPersistenceException, MqttException {
    	Gson gson = new Gson();
    	String jsonInString = gson.toJson(message);
    	MqttMessage mqttMessage = new MqttMessage(jsonInString.toString().getBytes() );
    	client.publish(topic, mqttMessage);
    	System.out.println(topic);
    }
    
    
    public void messageArrived(MessageArrivedAction action) {
    	
    	client.setCallback(new MqttCallback() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void messageArrived(String topic, MqttMessage message) throws Exception {
				try {
				System.out.println("messageArrived: " + topic);
				String text = new String(message.getPayload());
			
				JsonObject jsonObjectMsg = JsonParser.parseString(text.toString()).getAsJsonObject();
				
				int idMsg  = jsonObjectMsg.get("id").getAsInt();
				int fromId =  jsonObjectMsg.get("idFrom").getAsInt();
				int toId   =  jsonObjectMsg.get("idTo").getAsInt();
				String date = jsonObjectMsg.get("date").getAsString();
				String content = jsonObjectMsg.get("content").getAsString();
				
				//JsonObject jsonFrom = jsonObjectMsg.get("from").getAsJsonObject();
				//int fromId = jsonFrom.get("id").getAsInt();
				//String fromUserName = jsonFrom.get("userName").getAsString();
				
				//JsonObject jsonTo = jsonObjectMsg.get("to").getAsJsonObject();
				//int toId = jsonTo.get("id").getAsInt();
				//String toUserName = jsonTo.get("userName").getAsString();
				
				//contacto to = new contacto(toId, toUserName, "");
				
				Mensaje newMessage = new Mensaje(idMsg, fromId, toId, content, date); 
				System.out.println(newMessage.toString());
				action.messageArrived(topic, newMessage);
				}catch(Exception ex) {
					System.out.println(ex.toString());
				}
				
			}
			
			@Override
			public void deliveryComplete(IMqttDeliveryToken arg0) {
			}
			
			@Override
			public void connectionLost(Throwable arg0) {
			}
		});
    	
    }
    
    
}