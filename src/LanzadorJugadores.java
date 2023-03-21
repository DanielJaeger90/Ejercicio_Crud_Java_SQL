

	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	

	public class LanzadorJugadores {
		
		Conexion cx;
		
		public LanzadorJugadores() {
			cx=new Conexion();
		}
		public boolean insertarjugador(Jugadores jugador) {
			PreparedStatement ps=null;
			try {
				ps=cx.conectar().prepareStatement("INSERT INTO Jugadores VALUES(NULL,?,?,?,?)");
				
				ps.setString(2, jugador.getNombre());
				ps.setString(3, jugador.getEquipo());
				ps.setInt(4, jugador.getDorsal());
				ps.setDouble(5, jugador.getAltura());
				ps.executeUpdate();
				cx.desconectar();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			
		}
	}