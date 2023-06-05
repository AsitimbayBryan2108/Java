package com.chat.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.chat.domain.Mensaje;
import com.chat.domain.contacto;


public class datbase {
	
	private Statement stm ;
	
	public datbase() {
		try {
			
			Connection conect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProyectoChat", "postgres", "farid12345");
			stm = conect.createStatement();
		}catch (SQLException e) {
				
				System.out.println("Conexion erronea");
				e.printStackTrace();
			}
		
		System.out.println("Conexion exitosa");
		
	
	}
	
	public void add(Mensaje msg) {
		try {
		String queryInsert = "INSERT INTO public.messages ( id_from, id_to , fecha, contenido)"
				+ "VALUES ( '"+msg.get_idFrom()+"','"+msg.get_idTo()+"', '"+msg.getDate()+"', '"+msg.getContent()+"');";
			stm.execute(queryInsert);
			
		System.out.println("agregado correctamente");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("no se agrego correctamente");
		}
		
	}
	
	public Mensaje getLastMsg(int idFrom, int idTo) {
		try {
			Mensaje result = new Mensaje();
			String queryGet = "SELECT id_messages, id_from, id_to, fecha, contenido FROM messages " +
					" WHERE (id_from=" +String.valueOf(idFrom) + 
					" OR id_from=" + String.valueOf(idTo) + 
					") AND ( id_to=" + String.valueOf(idTo) + 
					" OR  id_to=" + String.valueOf(idFrom) + 
					") ORDER BY id_messages DESC LIMIT 1;" ;
			ResultSet rs = stm.executeQuery(queryGet);
		    
			while ( rs.next() ) {
				
				result.set_idFrom(rs.getInt("id_from"));
				result.set_idTo(rs.getInt("id_to"));
				result.setDate(rs.getString("fecha"));
				result.setContent(rs.getString("contenido"));
				//System.out.println("Se obtuvo el útimo mensaje de usario index: " + String.valueOf(idTo));
				
	      }
			return result;
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("No se pudo obtener el último mensaje.");
			return null;
		}
	}
	
	public boolean updateState(int idUser, boolean state) {
		try {
			String queryInsert = "UPDATE users SET estado=" + state +" WHERE id_user=" + idUser + ";"; 
			stm.execute(queryInsert);
				
			return false;
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				System.out.println("no se agrego correctamente");
				return false;
			}
			
	}
	
	public List<Mensaje> get(int idFrom, int idTo) {
		try {
			String queryGet = "SELECT * FROM messages " +
					" WHERE (id_from=" +String.valueOf(idFrom) + 
					" OR id_from=" + String.valueOf(idTo) + 
					") AND ( id_to=" + String.valueOf(idTo) + 
					" OR  id_to=" + String.valueOf(idFrom) + ");" ;
				
				
				ResultSet rs = stm.executeQuery(queryGet);
				
				List<Mensaje> resultList = new ArrayList<Mensaje>();
			    
				while ( rs.next() ) {
					 Mensaje result = new Mensaje();
					 result.set_idFrom(rs.getInt("id_from"));
			    	 result.set_idTo(rs.getInt("id_to"));
			    	 result.setDate(rs.getString("fecha"));
			    	 result.setContent(rs.getString("contenido"));
			    	
			    	 resultList.add(result);
			      }
						
			//System.out.println("agregado correctamente");	
			return resultList;
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				System.out.println("no se agrego correctamente");
				return null;
			}
			
	}
	
	public List<contacto> getContact() {
		return getContact(0);
	}
	
	public List<contacto> getContact(int idUser) {
		try {
			String queryGet = "SELECT id_user, nombre, username, estado, pathImage FROM users" ;
				
			if (idUser > 0) {
				queryGet = queryGet + " WHERE  (id_user<>"+String.valueOf(idUser)+")";
			}else {
				queryGet = queryGet + ";";
			}
			
			
				ResultSet rs = stm.executeQuery(queryGet);
				
				 List<contacto> result = new ArrayList<>();
			    
				while ( rs.next() ) {
					
					int id = rs.getInt("id_user");
					String nombre = rs.getString("nombre");
					String username = rs.getString("username");
					String pathImage = rs.getString("pathImage");
					boolean estado = rs.getBoolean("estado"); 
					contacto item= new contacto(id, username, "");
					item.setNombre(nombre);
					item.setImage(pathImage);
					item.setEstado(estado);
					result.add(item);
			    	
			      }
						
			System.out.println("se obtuvo correctamente los contactos");	
			return result;
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				System.out.println("NOoOOooOo se obtuvo correctamente los contacto");
				return null;
			}
			
	}
	
	public  contacto  checkLogin(String us, String ps) {
		try {
			
			String queryLogin = "SELECT * FROM users WHERE username LIKE'"+ us +"' and contrasena LIKE'"+ ps +"';" ;
			ResultSet rs = stm.executeQuery(queryLogin);
			
			while ( rs.next() ) {
				
				int id = rs.getInt("id_user");
				String nombre = rs.getString("nombre");
				String username = rs.getString("username");
				String pathImage = rs.getString("pathImage");
				boolean estado = rs.getBoolean("estado"); 
				contacto item= new contacto(id, username, "");
				item.setNombre(nombre);
				item.setImage(pathImage);
				item.setEstado(estado);
				return item;
				
		      }
			return null;
			
		}catch
		(SQLException e) {
			
			e.printStackTrace();
			System.out.println("NOoOOooOo se obtuvo correctamente los contacto");
		return null;
		}
		
	}
	
}