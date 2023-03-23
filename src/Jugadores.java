
public class Jugadores {

	public int ID ;
	public static String Nombre;
	public String Equipo;
	public int Dorsal;
	public double Altura;
	/**
	 * @param iD
	 * @param equipo
	 * @param dorsal
	 * @param altura
	 */
	public Jugadores(int iD, String nombre, String equipo, int dorsal, double altura) {
		super();
		ID = iD;
		Nombre = nombre;
		Equipo = equipo;
		Dorsal = dorsal;
		Altura = altura;
	}
	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	/**
	 * @return the equipo
	 */
	public String getEquipo() {
		return Equipo;
	}
	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(String equipo) {
		Equipo = equipo;
	}
	/**
	 * @return the dorsal
	 */
	public int getDorsal() {
		return Dorsal;
	}
	/**
	 * @param dorsal the dorsal to set
	 */
	public void setDorsal(int dorsal) {
		Dorsal = dorsal;
	}
	/**
	 * @return the altura
	 */
	public double getAltura() {
		return Altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		Altura = altura;
	}
	public int getID(Jugadores jugadorID) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "Jugadores [ID=" + ID + ", Equipo=" + Equipo + ", Dorsal=" + Dorsal + ", Altura=" + Altura + "]";
	}
}
	