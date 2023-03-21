import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Pruebas {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		// Registramos la clase  si el dirver es inferior a la versión 4.0
        Class.forName("org.sqlite.JDBC");
        
        // URL
		String url = "jdbc:sqlite:C:\\Users\\Alumno-tarde\\Desktop\\Daniel Iturralde\\Eclipse\\Examen1\\Sistema\\sistema";
		// con
		try(Connection con = DriverManager.getConnection(url)){
//			("INSERT INTO Jugadores VALUES(NULL,?,?,?,?)")
			var pt = con.prepareStatement("INSERT INTO Jugadores VALUES(NULL,?,?,?,?)");
			pt.setString(1,"ID");
			var resultSet = pt.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				
			}
		}
	}

}