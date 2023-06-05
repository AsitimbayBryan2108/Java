package JBDC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Producto_Repositorio  {
    public List <Producto_bd> getProducto()
    {		
		List<Producto_bd> producto = new ArrayList<Producto_bd>();			
		String sql = "SELECT id_codigo, nombre, descripcion, cantidad, precio FROM public.PRODUCTOS;";
        PreparedStatement query; 
        try 
		{
        	query = conn.open().prepareStatement(sql);
        	ResultSet resulSet = query.executeQuery();   	
        	while (resulSet.next()) 
			{
        		int id_codigo = resulSet.getInt("id_codigo");
        		String nombre= resulSet.getString("nombre");
        		String descripcion = resulSet.getString("descripcion");
        		int cantidad= resulSet.getInt("cantidad ");
        		Double precio= resulSet.getDouble("precio");      		
        	}
        } catch (SQLException e) {
			e.printStackTrace();
		}       
		return null;	
	}    
}
