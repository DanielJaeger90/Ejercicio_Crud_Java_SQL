import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static final String URL_DB = "jdbc:sqlite:C:ejemplo;
    
    // CONEXION
    public Connection conectar() {
        Connection cx = null;
        try {
            Class.forName("org.sqlite.JDBC");
            cx = DriverManager.getConnection(URL_DB);
            System.out.println("Conexión establecida correctamente.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al establecer la conexión.");
            e.printStackTrace();
        }
        return cx;
    }
    
    // DESCONEXION
    public void desconectar(Connection cx) {
        try {
            if (cx != null && !cx.isClosed()) {
                cx.close();
                System.out.println("Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión.");
            e.printStackTrace();
        }
    }
}
