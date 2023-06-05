package com.chat.repository;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

import com.chat.domain.Mensaje;
import com.chat.domain.contacto;

//import Mensaje.dominio.Mensaje;

public class Mensaje_rep {
	private List<Mensaje> messages = new ArrayList<>();
	private List<contacto> contacts = new ArrayList<>();
	
	
	public Mensaje_rep() {
		
	}
	
		public Mensaje_rep(boolean load) {
			contacts.add(new contacto(1,"Dayana", false,"https://i.ibb.co/2hFmPW6/Dayana.jpg","Dayana",""));
			contacts.add(new contacto(2,"Mateo",false,"https://i.ibb.co/kxnqNcX/descarga-1.jpg","Mateo",""));
			contacts.add(new contacto(3,"Joel",false,"https://i.ibb.co/mtbd4zR/descarga.jpg","Joel",""));
			contacts.add(new contacto(4,"Genesis",false,"https://i.ibb.co/d28V5bN/genesis.jpg","Genesis",""));
			contacts.add(new contacto(5,"Dome",false,"https://i.ibb.co/7QxQHzh/Dome.jpg","Dome",""));
			contacts.add(new contacto(6,"Tia",false,"https://i.ibb.co/BNBTc7s/tia.jpg","Tia",""));
			contacts.add(new contacto(7,"Karla",false,"https://i.ibb.co/N3N2Jkr/karla.jpg","Karla",""));
			contacts.add(new contacto(8,"Jackson", false,"https://i.ibb.co/fFmxbPK/Jackson.jpg","Jackson","6"));
			
			
			this.agg_mensajes(1, 2,  "Compaaa", "01/07/2022 10:10 ");
			this.agg_mensajes(2, 1, "Digame compi, que paso?", "01/07/2022 10:11 ");
			this.agg_mensajes(1, 2, "Necesito que me hagas un favor:(", "01/07/2022 10:12 ");
			this.agg_mensajes(2, 1, "Depende, dime que necesitas?", "01/07/2022 10:12 ");
			this.agg_mensajes(1, 2, "Es sobre la asistencia dile al profe que se me fue el internet", "01/07/2022 10:12 ");
			this.agg_mensajes(2, 1, "Ya dale pero aun no toma lista", "01/07/2022 10:12 ");
			
			this.agg_mensajes(2, 3, "Compaaa", "01/07/2022 10:10 ");
			this.agg_mensajes(3, 2, "Digame compi, que paso?", "01/07/2022 10:11 ");
			this.agg_mensajes(2, 3,"Necesito que me hagas un favor:(", "01/07/2022 10:12 ");
			
			this.agg_mensajes(1, 3, "Compaaa", "01/07/2022 10:10 ");
			this.agg_mensajes(1, 3, "Joeeeel respondee los mensajes", "02/07/2022 12:10 ");
			this.agg_mensajes(3, 1, "Que pasaaaa?", "02/07/2022 12:10 ");
			this.agg_mensajes(1, 3, "A que hora piensas llegarrr a la casa?", "02/07/2022 12:10 ");
			this.agg_mensajes(3, 1, "Ya voy en camino", "02/07/2022 12:10 ");
			
			this.agg_mensajes(4, 2,  "hola perdido", "08/07/2022 13:10 ");
			this.agg_mensajes(2, 4, "perdido????",  "08/07/2022 13:10 ");
			
			this.agg_mensajes(5, 2, "quieres salir?", "01/07/2022 14:10 ");
			this.agg_mensajes(2, 5, "no, hoy no quiero", "01/07/2022 14:10 ");
			
			this.agg_mensajes(5, 1, "oye estoy triste una chica no quieres salir conmigo", "01/07/2022 15:10 ");
			this.agg_mensajes(1, 5, "estoy libre si quieres ven a mi casa", "01/07/2022 15:10 ");
			
			this.agg_mensajes(7, 1, "Oye tu ya terminaste contabilidad", "01/07/2022 13:00 ");
			this.agg_mensajes(1, 7, "Si, anoche mismo lo entregue", "01/07/2022 13:30 ");
			this.agg_mensajes(7, 1, "Porfa explicame el ejercicio 3", "01/07/2022 13:50 ");
			this.agg_mensajes(7, 1,"Es que no lo entiendooo ", "01/07/2022 13:51");
			this.agg_mensajes(1, 7, "Dame 5 min y te mando un video explicando, ok.", "01/07/2022 13:54 ");
			
			this.agg_mensajes(8, 5, "Oye tu ya terminaste contabilidad", "01/07/2022 13:00 ");
			this.agg_mensajes(5, 8, "Si, anoche mismo lo entregue", "01/07/2022 13:30 ");
			this.agg_mensajes(8, 5, "Porfa explicame el ejercicio 3", "01/07/2022 13:50 ");
			this.agg_mensajes(8, 5, "Es que no lo entiendooo ", "01/07/2022 13:51");
			this.agg_mensajes(5, 8, "Dame 5 min y te mando un video explicando, ok.", "01/07/2022 13:54 ");
		}
		
		public List<Mensaje> getMessages() {
			return messages;
		}
		
		public Mensaje agg_mensajes(int idTo, String contenido, String fecha) {
			Random random = new Random();
			Mensaje n = new Mensaje(messages.size(), (random.nextInt(7)+1), idTo, contenido,fecha);
			messages.add(n);
			return n;
		}
		
		public Mensaje agg_mensajes(int idTo, int idFrom, String contenido, String fecha) {
			Mensaje n = new Mensaje(messages.size(), idFrom, idTo, contenido,fecha);
			messages.add(n);
			return n;
		}
		
		public Mensaje agg_mensajes(Mensaje myData) {
			Mensaje n = new Mensaje(myData.getId(), myData.get_idFrom(),  myData.get_idTo(), myData.getContent(), myData.getDate());
			messages.add(n);
			return n;
		}
		
			//obtiene todos los mensajes para msotralo en el chat
			public List<Mensaje> getMessage(int idChat){
				List<Mensaje> mensajes = new ArrayList<Mensaje>();
				for (Mensaje us: messages) {
					if (us.get_idFrom() == idChat || (us.get_idTo() == idChat)) {
						mensajes.add(us);						
					}
				}
				return mensajes;
			}
			
			//obtener el ultimo mensaje para que se muestre en la listview
			public Mensaje last_msj(contacto contact) {
				Mensaje msg = null;
				for (Mensaje us: messages) {
					if (us.get_idFrom() == contact.getId_cont() || (us.get_idTo() == contact.getId_cont())) {
						msg = us;						
					}
				}
				return msg;
			}
			
			
			public contacto checkuser(String user, String password) {
				for(int i = 0; i < contacts.size(); i++){
					contacto c = contacts.get(i);
					if (c.getUserName().equals(user) && c.getPassword().equals(password)) {
						return c;
					}
				
				}
					return null;
			}
			
			//obtener todos los usuarios para la lista observcable
			
			public List<contacto> getUsers(contacto perfil){
				List<contacto> result = new ArrayList<>();
				for(contacto us: contacts) {
					if (!us.equals(perfil)){
						result.add(us);
					}}	
				
				return result;
			}
			
			public List<contacto> getUsers(){
				
				return contacts;
			}
			
			
			public contacto getUser(int idChat){
				for(contacto us: contacts) {
					if (us.getId_cont() == idChat){
						return us;
					}}
				
				return null;
			}
			
}