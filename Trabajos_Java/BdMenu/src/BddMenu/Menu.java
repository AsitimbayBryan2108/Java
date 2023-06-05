package BddMenu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
	
	public class Conn {
		
		static String url = "jdbc:postgresql://localHost:5432/BasededatosconMenu";
		static String usuario = "postgres";
		static String contrasena = "12345";
			
		public static Connection open () throws SQLException{
			Connection conn = DriverManager.getConnection(url, usuario, contrasena);
			return conn;
		}

	}
	
	public static void mostrarUsuarios() {
		Connection conn = null;
		PreparedStatement query;
		
		try {
			
			Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/BasededatosconMenu";
            String usuario = "postgres";
            String contrasena = "12345";
            
            conn = DriverManager.getConnection(url, usuario, contrasena);

            String sql = "SELECT id, nombre, apellido, usuario, contrasena FROM public.usuarios;";
            query = conn.prepareStatement(sql);
            
            ResultSet resultSet = query.executeQuery();
            
            while(resultSet.next()) {
            	int id = resultSet.getInt("id");
            	String name = resultSet.getString("nombre");
            	String lastname = resultSet.getString("apellido");
            	String username = resultSet.getString("usuario");
            	
            	System.out.println(id +" "+ name +" "+ lastname + " " + username);
            	System.out.println("--------------------------");
            }
            
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void ingresarUsuario() {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese id usuario: ");
		int id = leer.nextInt();
		System.out.println("Ingrese Nombre: ");
		String name = leer.next();
		System.out.println("Ingrese Apellido: ");
		String lastname = leer.next();
		System.out.println("Ingrese el Usuario: ");
		String username = leer.next();
		System.out.println("Ingrese clave: ");
		int password = leer.nextInt();
		
		PreparedStatement query;
		try {
			
            String url = "jdbc:postgresql://localhost:5432/BasededatosconMenu";
            String usuario = "postgres";
            String contrasena = "12345";
            Connection conn = DriverManager.getConnection(url, usuario, contrasena);
			
			String sql = "Insert into public.usuarios (id, nombre, apellidos, usuario, contrasena) values(?,?,?,?,?);";
			query = conn.prepareStatement(sql);
			query.setInt(1, id);
			query.setString(2, name);
			query.setString(3, lastname);
			query.setString(4, username);
			query.setInt(5, password);
			query.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println(e.getCause());
			System.out.println("--------------------------");
		}
	}
	
	public static void modificarUsuario() {
		Scanner leer = new Scanner(System.in);
	    System.out.println("Ingresar id del usuario a modificar: ");
	    int id = leer.nextInt();
	    System.out.println("Ingresar nuevo nombre: ");
	    String name = leer.next();
	    System.out.println("Ingresar el nuevo apellido: ");
	    String lastname = leer.next();
	    System.out.println("Ingresar el nuevo nombre de usuario: ");
	    String username = leer.next();
	    System.out.println("Ingresar la nueva clave: ");
	    int password = leer.nextInt();
	    PreparedStatement query;
	    
	    try {
	        String url = "jdbc:postgresql://localhost:5432/BasededatosconMenu";
	        String usuario = "postgres";
	        String contrasena = "12345";
	        Connection conn = DriverManager.getConnection(url, usuario, contrasena);

	        String sql = "UPDATE public.usuarios SET name= " + name + "lastname=" + lastname + "username= " + username + "password= " + password  
	        		+ "WHERE id + " + id +";";
	        
	        query = conn.prepareStatement(sql);
	        
	        ///query.setInt(1, id);
	        query.setString(1, name);
	        query.setString(2, lastname);
	        query.setString(3, username);
	        query.setInt(4, password);
	        
	        query.executeUpdate();
	        System.out.println("actualizado con exito");
	        System.out.println("--------------------------");
	       
	    } catch (SQLException e) {
	        System.out.println(e.getCause());
	        System.out.println("--------------------------");
	    }
	    
	}
	
	public static void eliminarUsuario() {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingresar ID del usuario a eliminar: ");
		int id = leer.nextInt();
		
		PreparedStatement query;
		try {
			
            String url = "jdbc:postgresql://localhost:5432/BasededatosconMenu";
            String usuario = "postgres";
            String contrasena = "12345";
            Connection conn = DriverManager.getConnection(url, usuario, contrasena);
			
			String sql = "DELETE FROM public.usuarios "
					+ "WHERE id = "
					+ id + ";";
			query = conn.prepareStatement(sql);
			
			query.executeUpdate();
			
			System.out.println("Se elimino el usuario correctamente...");
			System.out.println("--------------------------");
			
		}catch(SQLException e) {
			System.out.println(e.getCause());
			System.out.println("--------------------------");
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner ingreso = new Scanner(System.in);
		int options = -1;
		
		do {
			
			System.out.println("<1> Mostrar usuarios");
			System.out.println("<2> Ingresar usuarios");
			System.out.println("<3> Modificar usuario");
			System.out.println("<4> Eliminar usuarios");
			System.out.println("<5> salir");
			System.out.println("----------------------");
			
			options = ingreso.nextInt();
			
			if(options == 1) {
				System.out.println("Usuarios:");
				mostrarUsuarios();
			}else if(options == 2) {
				System.out.println("Ingresar usuario:");
				ingresarUsuario();
			}else if(options == 3) {
				System.out.println("Modificar usuario:");
				modificarUsuario();
			}else if(options == 4) {
				System.out.println("Eliminar usuario:");
				eliminarUsuario();
			}
		}while(options != 0);
		
		System.out.println("....");
		
	}
}
