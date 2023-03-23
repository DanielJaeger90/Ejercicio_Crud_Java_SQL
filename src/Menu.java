import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		// Ejemplo menú
		menu();
	}

	// INSERTARJUGADOR
	public static boolean insertarjugador(Jugadores Nuevojugador) throws ClassNotFoundException {
		PreparedStatement ps = null;

		Class.forName("org.sqlite.JDBC");
		try (Connection cx = DriverManager.getConnection(
				"jdbc:sqlite:C:\\Users\\Alumno-tarde\\Desktop\\Daniel Iturralde\\Eclipse\\Examen1\\Sistema\\sistema3")) {

			ps = cx.prepareStatement("INSERT INTO Jugadores VALUES(?,?,?,?,?)");
			ps.setInt(1, Localizadorid() + 1);
			ps.setString(2, Nuevojugador.getNombre());
			ps.setString(3, Nuevojugador.getEquipo());
			ps.setInt(4, Nuevojugador.getDorsal());
			ps.setDouble(5, Nuevojugador.getAltura());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Se ha agregado correctamente");
			return true;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido agregar");
			e.printStackTrace();
			return false;
		}

	}

	// BORRAR JUGADOR
	public static boolean BorrarJugador(int ID) throws ClassNotFoundException {
		PreparedStatement ps = null;
		Class.forName("org.sqlite.JDBC");
		try(Connection cx = DriverManager.getConnection(
				"jdbc:sqlite:C:\\Users\\Alumno-tarde\\Desktop\\Daniel Iturralde\\Eclipse\\Examen1\\Sistema\\sistema3")) {
			
			
			ps = cx.prepareStatement("DELETE FROM Jugadores WHERE ID=?");
			ps.setInt(1, ID);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Se ha BORRADO correctamente");
			
			return true;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se ha BORRADO correctamente");
			e.printStackTrace();
			return false;
		}

	}

//	SACAR id DEVUELVE UN ID
	public static int Localizadorid() throws ClassNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		Class.forName("org.sqlite.JDBC");
		
		try(Connection cx = DriverManager.getConnection(
				"jdbc:sqlite:C:\\Users\\Alumno-tarde\\Desktop\\Daniel Iturralde\\Eclipse\\Examen1\\Sistema\\sistema3")) {
			
			ps = cx.prepareStatement("SELECT MAX(ID) FROM Jugadores");
			rs = ps.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR Al Sacar el ID");
			e.printStackTrace();
		}

		return 0;
	}

//	MOSTRAR JUGADORES (DA FALLO EN CONSULTARJUGADORES)
	public static ArrayList<Jugadores> consultaJugadores() throws ClassNotFoundException {
		ArrayList<Jugadores> lista = new ArrayList<Jugadores>();
//		Iterator<Jugadores> IDIterator = lista.iterator();
//		while(IDIterator.hasNext()) {
//			Jugadores Mostrar= IDIterator.next();
//			System.out.print(Mostrar+" / ");
//			
//		}

		PreparedStatement ps = null;
		ResultSet rs = null;
		Class.forName("org.sqlite.JDBC");
		try(Connection cx = DriverManager.getConnection(
				"jdbc:sqlite:C:\\Users\\Alumno-tarde\\Desktop\\Daniel Iturralde\\Eclipse\\Examen1\\Sistema\\sistema3")) {
			
			
			ps = cx.prepareStatement("SELECT * FROM Jugadores ");
			rs = ps.executeQuery();
			while (rs.next()) {
				Jugadores jugadorAMostrar = new Jugadores(0, null, null, 0, 0.0);
				jugadorAMostrar.setID(rs.getInt("id"));
				jugadorAMostrar.setNombre(rs.getString("Nombre"));
				jugadorAMostrar.setEquipo(rs.getString("Equipo"));
				jugadorAMostrar.setDorsal(rs.getInt("Numero"));
				jugadorAMostrar.setAltura(rs.getDouble("Altura"));
				lista.add(jugadorAMostrar);
				
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "consultarJugadores no ha funcionado");
			e.printStackTrace();
		}
		return lista;

	}

	public static int menu() {
		int respuesta = 0;
		int Dorsal = 0;
		double Altura = 0.0;
		Integer eliminar = 0;

		while (respuesta == 0) {
			try {
				String opcion = JOptionPane
						.showInputDialog("Introduce una opción \n 1- Añadir \n 2- Listar \n 3- Borrar");
				respuesta = Integer.parseInt(opcion);

//				Opcion1				
				try {
					if (opcion.equals("1")) {
//					Añadir Nombre
						String AñadirNombre = JOptionPane.showInputDialog("Añadir Nombre del Jugador");
						JOptionPane.showMessageDialog(null, "Nombre" + " " + (AñadirNombre) + " " + "añadido");

//					AñadirEquipo
						String AñadirEquipo = JOptionPane.showInputDialog("Añadir Equipo del Jugador");
						JOptionPane.showMessageDialog(null, "Equipo" + " " + (AñadirEquipo) + " " + "añadido");

//					AñadirDorsal
						String AñadirDorsal = JOptionPane.showInputDialog("Añadir Dorsal del Jugador");
						JOptionPane.showMessageDialog(null, "Dorsal" + " " + (AñadirDorsal) + " " + "añadido");
						Dorsal = Integer.valueOf(AñadirDorsal);

//					Añadir Altura
						String AñadirAltura = JOptionPane.showInputDialog("Añadir Altura del Jugador");
						JOptionPane.showMessageDialog(null, "Altura" + " " + (AñadirAltura) + " " + "añadido");
						Altura = Double.valueOf(AñadirAltura);

//					Nuevo Jugador
						Jugadores Nuevojugador = new Jugadores(Localizadorid(), AñadirNombre, AñadirEquipo, Dorsal,
								Altura);
						Nuevojugador.setNombre(AñadirNombre);
						Nuevojugador.setEquipo(AñadirEquipo);
						Nuevojugador.setDorsal(Dorsal);
						Nuevojugador.setAltura(Altura);
						insertarjugador(Nuevojugador);
						JOptionPane.showMessageDialog(null,
								"El jugador" + " " + (AñadirNombre) + " " + "ha sido Añadido");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No se ha podido escribir el jugador");
				}

//				LISTAR
				try {
					if (opcion.equals("2")) {
						consultaJugadores();
						JOptionPane.showMessageDialog(null, consultaJugadores() + " / ");

					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No se ha podido Listar a los jugadores");
				}

//				BORRAR JUGADOR
				try {
					if (opcion.equals("3")) {
						String Eliminar = JOptionPane.showInputDialog("Vas a Eliminar a un Jugador");
						eliminar = Integer.valueOf(Eliminar);
						BorrarJugador(eliminar);

					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No se ha podido escribir el Borrar jugador");
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Fallo en el Menu");
			}
		}
		return respuesta;
	}

}
