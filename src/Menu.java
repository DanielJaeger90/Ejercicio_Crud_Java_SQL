import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;

import javax.management.openmbean.OpenDataException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;




public class Menu {

	public static void main(String[] args) {
		// Ejemplo menú
		menu();
	}

	public static int menu() {
		int respuesta = 0;
		int Dorsal =0;
		double Altura = 0.0;
		
		while (respuesta == 0) {
			try {
				String opcion = JOptionPane.showInputDialog("Introduce una opción \n 1- Añadir \n 2- Listar \n 3- Borrar");
				respuesta = Integer.parseInt(opcion);

				
				
//				Opcion1				
				if (opcion.equals(1)); {
//					Añadir Nombre
					String AñadirNombre = JOptionPane.showInputDialog("Añadir Nombre del Jugador");
					JOptionPane.showMessageDialog(null, "Nombre"+""+(AñadirNombre)+""+"añadido");
				
					
//					AñadirEquipo
					String AñadirEquipo = JOptionPane.showInputDialog("Añadir Equipo del Jugador");
					JOptionPane.showMessageDialog(null, "Equipo"+""+(AñadirEquipo)+""+"añadido");
					
					
//					AñadirDorsal
					String AñadirDorsal = JOptionPane.showInputDialog("Añadir Dorsal del Jugador");
					JOptionPane.showMessageDialog(null, "Dorsal"+""+(AñadirDorsal)+""+"añadido");
					AñadirDorsal.valueOf(Dorsal);
					
					
//					Añadir Altura
					String AñadirAltura = JOptionPane.showInputDialog("Añadir Altura del Jugador");
					JOptionPane.showMessageDialog(null, "Altura"+""+(AñadirAltura)+""+"añadido");					
					AñadirAltura.valueOf(Altura);
					
//					Nuevo Jugador
					Jugadores jugador = new Jugadores(AñadirNombre, AñadirEquipo, Dorsal, Altura);
					
					jugador.setNombre(AñadirNombre);
					jugador.setEquipo(AñadirEquipo);
					jugador.setDorsal(Dorsal);
					jugador.setAltura(Altura);
					insertarjugador(jugador);
					JOptionPane.showMessageDialog(null, "El jugador"+""+ (AñadirNombre)+"" +"ha sido Añadido" );
				}

				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ERROR");
			}
		}
		return respuesta;
	}

	public static boolean insertarjugador(Jugadores jugador) throws ClassNotFoundException {
		PreparedStatement ps=null;
		try {
			
			Class.forName("org.sqlite.JDBC");
			Connection cx=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Alumno-tarde\\Desktop\\Daniel Iturralde\\Eclipse\\Examen1\\Sistema\\sistema");
			
			ps=cx.prepareStatement("INSERT INTO Jugadores VALUES(NULL,?,?,?,?)");
			ps.setString(1, jugador.getNombre());
			ps.setString(2, jugador.getEquipo());
			ps.setInt(3, jugador.getDorsal());
			ps.setDouble(4, jugador.getAltura());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Se ha agregado correctamente");
			cx.close();
			return true;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido agregar");
			e.printStackTrace();
			return false;
		}
	}
}