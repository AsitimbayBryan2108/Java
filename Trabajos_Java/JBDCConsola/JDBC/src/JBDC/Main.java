package JBDC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
public class Conexion {
		
		static String url = "jdbc:postgresql://localHost:5432/JDBConsola";
		static String usuario = "postgres";
		static String contrasena = "12345";			
		public static Connection open () throws SQLException
        {
			Connection conected = DriverManager.getConnection(url, usuario, contrasena);
			return conected;
		}
	}    
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        int options = -1;    
        do {
            System.out.println("<1> INGRESAR PRODUCTO");
            System.out.println("<2> MODIFICAR PRODUCTO");
            System.out.println("<3> ELIMINAR PRODUCTO");
            System.out.println("<4> CONSULTAR PRODUCTO POR CODIGO");
            System.out.println("<5> CONSULTAR TABLA PRODUCTO");
            System.out.println("<0> SALIR");       
            options = ingresar.nextInt();    
            if(options == 1) 
            {
                System.out.println("INGRESAR PRODUCTO");
                INGRESAR_PRODUCTO();
            }
            else if(options == 2) 
            {
                System.out.println("MODIFICAR PRODUCTO");
                MODIFICAR_PRODUCTO();
            }
            else if(options == 3) 
            {
                System.out.println("ELIMINAR PRODUCTO");
                ELIMINAR_PRODUCTO();
            }
            else if(options == 4) 
            {
                System.out.println("CONSULTAR PRODUCTOS DE LA BASE DE DATOS");
                CONSULTAR_PRODUCTO_CODIGO();
            }
            
            else if(options == 5) 
            {
                System.out.println("CONSULTAR TABLA PRODUCTO");
                CONSULTAR_PRODUCTOS();
            }
        }while(options != 0);
        
    }

    public static void INGRESAR_PRODUCTO() 
    {
        Scanner sc = new Scanner(System.in);
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBConsola", "postgres", "12345");
            System.out.println("Ingrese los datos del producto:");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Descripción: ");
            String descripcion = sc.nextLine();
            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            System.out.print("Precio: ");
            Double precio = sc.nextDouble();
    
            String sql = "INSERT INTO productos (nombre, descripcion, cantidad, precio) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nombre);
            pstmt.setString(2, descripcion);
            pstmt.setInt(3, cantidad);
            pstmt.setDouble(4, precio);
            pstmt.executeUpdate();
    
            System.out.println("Producto ingresado correctamente.");
    
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error al ingresar el producto: " + e.getMessage());
        }
    }
    
    public static void MODIFICAR_PRODUCTO() 
    {   Scanner sc = new Scanner(System.in);
    
    try {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBConsola", "postgres", "12345");
    
        System.out.print("Ingrese el código del producto a modificar: ");
        int id_codigo = sc.nextInt();
        sc.nextLine();
    
        String sql = "SELECT * FROM productos WHERE Id_codigo = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id_codigo);
        ResultSet rs = pstmt.executeQuery();
    
        if (rs.next()) {
            System.out.println("Código: " + rs.getInt("id_codigo"));
            System.out.println("Nombre: " + rs.getString("nombre"));
            System.out.println("Descripción: " + rs.getString("descripcion"));
            System.out.println("Cantidad: " + rs.getInt("cantidad"));
            System.out.println("Precio: " + rs.getDouble("precio"));
    
            System.out.println("Ingrese los nuevos valores del producto:");
    
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
    
            System.out.print("Descripción: ");
            String descripcion = sc.nextLine();
    
            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
    
            System.out.print("Precio: ");
            double precio = sc.nextDouble();
    
            sql = "UPDATE productos SET nombre = ?, descripcion = ?, cantidad = ?, precio = ? WHERE Id_codigo = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nombre);
            pstmt.setString(2, descripcion);
            pstmt.setInt(3, cantidad);
            pstmt.setDouble(4, precio);
            pstmt.setInt(5, id_codigo);
            pstmt.executeUpdate();
    
            System.out.println("Producto modificado correctamente.");
        } else {
            System.out.println("No se encontró un producto con el código ingresado.");
        }
    
        rs.close();
        pstmt.close();
        conn.close();
    
    } catch (SQLException ex) {
        System.out.println("Error al modificar el producto: " + ex.getMessage());
    }
    }
        
    
    
    
    public static void ELIMINAR_PRODUCTO()  {
        
         Scanner sc = new Scanner(System.in);
         try {
             
             Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBConsola", "postgres", "12345");
             System.out.print("Ingrese el código del producto a eliminar: ");
             int codigo = sc.nextInt();
             String sql = "DELETE FROM productos WHERE id_codigo = ?";
             PreparedStatement pstmt = conn.prepareStatement(sql);
             pstmt.setInt(1, codigo);
             
             int filasAfectadas = pstmt.executeUpdate();
             
             if(filasAfectadas > 0) {
                 System.out.println("Producto eliminado correctamente.");
             } else {
                 System.out.println("No se pudo eliminar el producto. Verifique el código ingresado.");
             }
             
             conn.close();
         } catch(SQLException e) {
             System.out.println("Error al eliminar el producto: " + e.getMessage());
         }
     }
    
    
    
    public static void CONSULTAR_PRODUCTO_CODIGO() {
        
                Scanner sc = new Scanner(System.in);
                try {
                   
                    Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBConsola", "postgres", "12345");
                    
                    System.out.print("Ingrese el código del producto a buscar: ");
                    int codigo = sc.nextInt();
                    
                    
                    String sql = "SELECT * FROM productos WHERE id_codigo = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setInt(1, codigo);
                    
                   
                    ResultSet rs = pstmt.executeQuery();
                    
           
                    if(rs.next()) {
                        System.out.println("Nombre: " + rs.getString("nombre"));
                        System.out.println("Descripción: " + rs.getString("descripcion"));
                        System.out.println("Cantidad: " + rs.getInt("cantidad"));
                        System.out.println("Precio: " + rs.getDouble("precio"));
                    } else {
                        System.out.println("No se encontró ningún producto con el código ingresado.");
                    }
                    
                  
                    rs.close();
                    pstmt.close();
                    conn.close();
                } catch(SQLException e) {
                  
                    System.out.println("Error al consultar el producto: " + e.getMessage());
                }
            }
    
    
    
    public static void CONSULTAR_PRODUCTOS() 
    
    {
    Connection conectec = null;
    PreparedStatement query;
    
    try {
        Class.forName ("org.postgresql.Driver");
        String url= "jdbc:postgresql://localhost:5432/JDBConsola";
        String usuario = "postgres";
        String contrasena = "12345";
        conectec = DriverManager.getConnection(url, usuario, contrasena);
        
        String sql= "SELECT id_codigo, nombre, descripcion, cantidad, precio FROM public.productos;";
        query = conectec.prepareStatement (sql);
        ResultSet resultset= query.executeQuery();
        while (resultset.next())
        {
            int id_codigo = resultset.getInt ("id_codigo");
            String nombre = resultset.getString ("nombre");
            String descripcion= resultset.getString ("descripcion");
            int cantidad = resultset.getInt ("cantidad");
            double precio = resultset.getDouble ("precio");
            System.out.println (id_codigo + " " + nombre + " " + descripcion + " " + cantidad + " " + precio + " " );			
        
    }
    }catch (ClassNotFoundException e)
    {
    e.printStackTrace();
    }	catch (SQLException e)
    {
        e.printStackTrace();
    }
    }
}