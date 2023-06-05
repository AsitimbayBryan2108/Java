package Menubdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu 
{
    public class Conn 
    {
		
		static String url = "jdbc:postgresql://localHost:5432/BasededatosconMenu";
		static String usuario = "postgres";
		static String contrasena = "12345";
			
		public static Connection open () throws SQLException
        {
			Connection conn = DriverManager.getConnection(url, usuario, contrasena);
			return conn;
		}

	} 
	
	public static void main(String[] args) {
		
		Scanner ingreso = new Scanner(System.in);
		int options = -1;
		
		do {
			System.out.println("-1- Mostrar usuarios");
			System.out.println("-2- Ingresar usuarios");
			System.out.println("-3- Modificar usuario");
			System.out.println("-4- Eliminar usuarios");
			System.out.println("-5- salir");
			
			options = ingreso.nextInt();
			
			if(options == 1) 
            {
				System.out.println("=======================");
				System.out.println("USUARIOS REGISTROS");
				mostrarUsuarios();
			}else if(options == 2) 
            {
				System.out.println("=======================");
				System.out.println("--REGISTRO USUARIO--");
				ingresarUsuario();
			}else if(options == 3) 
            {
				System.out.println("=======================");
				System.out.println("MODIFICAR USUARIO");
				modificarUsuario();
			}else if(options == 4) 
            {
				System.out.println("=======================");
				System.out.println("ELIMINAR USUARIO");
				eliminarUsuario();
			}

		}while(options != 5);
		System.out.println("......");
		
	}   

    public static void mostrarUsuarios() 
    {
		Connection conn = null;
		PreparedStatement query;
		
		try 
        {
			Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/BasededatosconMenu";
            String usuario = "postgres";
            String contrasena = "12345";
            
            conn = DriverManager.getConnection(url, usuario, contrasena);

            String sql = "SELECT id, nombre, apellido, usuario, contrasena FROM public.usuarios;";
            query = conn.prepareStatement(sql);
            
            ResultSet resultSet = query.executeQuery();
            
            while(resultSet.next()) 
			{
            	int id_users = resultSet.getInt("id");
            	String name = resultSet.getString("nombre");
            	String lastname = resultSet.getString("apellido");
            	String username = resultSet.getString("usuario");
            	
            	System.out.println(id_users +" "+ name +" "+ lastname + " " + username);
				System.out.println("=======================");
            }
            
		}catch (ClassNotFoundException e) 
        {
			e.printStackTrace();
		} catch (SQLException e)
        {
			e.printStackTrace();
		}
	}
	
	public static void ingresarUsuario() 
    {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese id usuario: ");
		int id_users = leer.nextInt();
		System.out.println("Ingrese Nombre: ");
		String name = leer.next();
		System.out.println("Ingrese Apellido: ");
		String lastname = leer.next();
		System.out.println("Ingrese Nombre de Usuario: ");
		String username = leer.next();
		System.out.println("Ingrese Contraseña: ");
		String password = leer.next();
		
		PreparedStatement query;
		try 
        {
			
            String url = "jdbc:postgresql://localhost:5432/BasededatosconMenu";
            String usuario = "postgres";
            String contrasena = "12345";
            Connection conn = DriverManager.getConnection(url, usuario, contrasena);
			
			String sql = "Insert into public.usuarios(id, nombre, apellido, usuario, contrasena) values(?,?,?,?,?);";
			query = conn.prepareStatement(sql);
			query.setInt(1, id_users);
			query.setString(2, name);
			query.setString(3, lastname);
			query.setString(4, username);
			query.setString(5, password);
			query.executeUpdate();
			System.out.println("=======================");
			
		}catch(SQLException e) 
        {
			System.out.println(e.getCause());
		}
	}
	
	public static void modificarUsuario() 
    {
		Scanner leer = new Scanner(System.in);
	    System.out.println("Ingrese id del usuario a modificar: ");
	    int id_users = leer.nextInt();
	    System.out.println("Ingrese el nuevo nombre: ");
	    String name = leer.next();
	    System.out.println("Ingrese el nuevo apellido: ");
	    String lastname = leer.next();
	    System.out.println("Ingrese el nuevo nombre de usuario: ");
	    String username = leer.next();
	    System.out.println("Ingrese la nueva contraseña: ");
	    String password = leer.next();
		System.out.println("=======================");
	    PreparedStatement query;
	    
	    try 
		{
	        String url = "jdbc:postgresql://localhost:5432/BasededatosconMenu";
	        String usuario = "postgres";
	        String contrasena = "12345";
	        Connection conn = DriverManager.getConnection(url, usuario, contrasena);
	        
	        String sql = "UPDATE public.usuarios SET nombre = " + name + "apellido =" + lastname + "usuario = " + username + "contrasena = " + password  
	        		+ "WHERE id + " + id_users +";";
	        
	        query = conn.prepareStatement(sql);
	        
	        query.setInt(1, id_users);
	        query.setString(1, name);
	        query.setString(2, lastname);
	        query.setString(3, username);
	        query.setString(4, password);
	        
	        query.executeUpdate();
	        System.out.println("actualizado ");
			System.out.println("=======================");
	       
	    } catch (SQLException e) {
	        //System.out.println(e.getCause());
			System.out.println("actualizado ");
			System.out.println("=======================");
	    }
	    
	}
	
	public static void eliminarUsuario() 
	{
		Scanner leer = new Scanner(System.in);	
		System.out.println("Digite el id del usuario al que desea eliminar: ");
		int id_users = leer.nextInt();	
		PreparedStatement query;
		try {
			
            String url = "jdbc:postgresql://localhost:5432/BasededatosconMenu";
            String usuario = "postgres";
            String contrasena = "12345";
            Connection conn = DriverManager.getConnection(url, usuario, contrasena);
						
			String sql = "DELETE FROM public.usuarios "
					+ "WHERE id = "
					+ id_users + ";";
			query = conn.prepareStatement(sql);			
			query.executeUpdate();			
			System.out.println("Exito al eliminar el usuario...");
			
		}catch(SQLException e) {
			//System.out.println(e.getCause());
			System.out.println("Exito al eliminar el usuario...");
			System.out.println("=======================");
		}
	}
	
	
}
