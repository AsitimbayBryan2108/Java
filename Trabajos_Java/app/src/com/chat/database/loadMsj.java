package com.chat.database;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	import com.chat.domain.Mensaje;
	import com.chat.domain.contacto;
	import com.chat.repository.Mensaje_rep;


public class loadMsj {	
		
		public static void main(String[]args) {
			
			
		Mensaje_rep mensajeRep = new Mensaje_rep(true);
			
			try {
				
				Connection conect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProyectoChat", "postgres", "farid12345");
				Statement stm = conect.createStatement();
				String queryInsert;
				String queryDelete;
				String queryCreate;
				
				
				// se elimina las tablas messages y user //
				queryDelete = "drop table messages, users";
				
				stm.execute(queryDelete);
				
				
				// se vuelve a crear las tablas //
				queryCreate = "CREATE TABLE users (\r\n"
						+ "    \r\n"
						+ "    id_user serial not null,\r\n"
						+ "    nombre character varying not null,\r\n"
						+ "    username character varying not null,\r\n"
						+ "    contrasena character varying not null,\r\n"
						+ "    estado boolean not null ,\r\n"
						+ "    pathImage character varying ,\r\n"
						+ "    constraint pk_user primary key (id_user)\r\n"
						+ "    \r\n"
						+ ");\r\n"
						+ "\r\n"
						+ "CREATE TABLE messages (\r\n"
						+ "    \r\n"
						+ "    id_messages serial not null,\r\n"
						+ "    id_from integer not null,\r\n"
						+ "    id_to integer not null,\r\n"
						+ "    fecha time not null,\r\n"
						+ "    contenido character varying not null,\r\n"
						+ "    constraint pk_messages primary key (id_messages),\r\n"
						+ "    constraint fk_from foreign key (id_from) references users (id_user),\r\n"
						+ "    constraint fk_to foreign key (id_to) references users (id_user)\r\n"
						+ "    \r\n"
						+ ");";
				
				stm.execute(queryCreate);
				
				// dentro de los for o bucles se insertan los registros tanto de user como de message //
				for(contacto user: mensajeRep.getUsers()) {
		
					queryInsert = "INSERT INTO public.users (nombre , username, contrasena, estado, pathImage)"
							+ "VALUES ('"+user.getNombre()+"', '"+user.getUserName()+"', '"+user.getPassword()+"', '"+user.getEstado()+"', '"+user.getImage()+"');";
								
					stm.execute(queryInsert);
		
				}
				
				for(Mensaje msj: mensajeRep.getMessages()) {
					queryInsert = "INSERT INTO public.messages (id_from, id_to, fecha, contenido)"
							+ "VALUES ( '"+msj.get_idFrom()+"','"+msj.get_idTo()+"', '"+msj.getDate()+"', '"+msj.getContent()+"');";
					
					stm.execute(queryInsert);
							
				}
			
				System.out.println("Conexion exitosa");
				
			}
			
			catch (SQLException e) {
				
				System.out.println("Conexion erronea");
				e.printStackTrace();
			}
			
		}

	}


