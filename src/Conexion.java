//"jdbc:sqlite:C:\\Users\\Alumno-tarde\\Desktop\\Daniel Iturralde\\Eclipse\\Examen1\\Sistema\\sistema"
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
//	CONEXION
	Connection cx=null;
	public Connection conectar () {
		try {
			Class.forName("org.sqlite.JDBC");
			cx=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Alumno-tarde\\Desktop\\Daniel Iturralde\\Eclipse\\Examen1\\Sistema\\sistema");
			System.out.print("Estas conectado");
		} catch (ClassNotFoundException |SQLException e) {
			
		}
		return cx;		
	}
//	DESCONEXION
	public void desconectar() {
		try {
			cx.close();{
				System.out.print("La conexion ha cerrado");
			}
		} catch (SQLException e) {
			System.out.print("La conexion ha fallado");
			e.printStackTrace();
		}
		
	}
//	Pruebas conexión
	public static void main (String[] args) {
		Conexion cx=new Conexion();
		cx.conectar();
	}
	
}
