package JBDC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conn
{
    static String url = "jdbc:postgresql://localHost:5432/JDBConsola";
	static String usuario = "postgres";
	static String contrasena = "12345";

    public static Connection open () throws SQLException
    {
		Connection conn = DriverManager.getConnection(url, usuario, contrasena);
		return conn;
	}
}