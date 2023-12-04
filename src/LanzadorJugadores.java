import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LanzadorJugadores {

    public boolean insertarJugador(Jugadores jugador) {
        // Consulta SQL para insertar un nuevo jugador
        String INSERT_SQL = "INSERT INTO Jugadores VALUES(NULL,?,?,?,?)";

        try (Conexion cx = new Conexion(); PreparedStatement ps = cx.conectar().prepareStatement(INSERT_SQL)) {
            // Configurar los parámetros de la consulta
            ps.setString(1, jugador.getNombre());
            ps.setString(2, jugador.getEquipo());
            ps.setInt(3, jugador.getDorsal());
            ps.setDouble(4, jugador.getAltura());

            // Ejecutar la consulta
            ps.executeUpdate();
            
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
