package Menubdd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio 
{
    public List<Usuario> getUsuarios()
    {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();	
		
		String sql = "SELECT id, nombre, apellido, usuario, contrasena FROM public.usuarios;";
        PreparedStatement query;
        
        
        try 
		{
        	query = Conn.open().prepareStatement(sql);
        	ResultSet resulSet = query.executeQuery();
        	
        	while (resulSet.next()) 
			{
        		int id_users = resulSet.getInt("id");
        		String name = resulSet.getString("nombre");
        		String lastname = resulSet.getString("apellido");
        		String username = resulSet.getString("usuario");
        		
        		//Usuario user = new Usuario(id_users, name, lastname, username);
        		//usuarios.add(user);
        	}
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		return null;
		
	}    
}
