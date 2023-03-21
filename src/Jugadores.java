
public class Jugadores {

	int ID ;
	String Nombre, Equipo;
	int Dorsal;
	double Altura;
	/**
	 * @param iD
	 * @param nombre
	 * @param equipo
	 * @param dorsal
	 * @param altura
	 */
	public Jugadores( String nombre, String equipo, int dorsal, double altura) {
		super();
		
		Nombre = nombre;
		Equipo = equipo;
		Dorsal = dorsal;
		Altura = altura;
		
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getEquipo() {
		return Equipo;
	}
	public void setEquipo(String equipo) {
		Equipo = equipo;
	}
	public int getDorsal() {
		return Dorsal;
	}
	public void setDorsal(int dorsal) {
		Dorsal = dorsal;
	}
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
}
