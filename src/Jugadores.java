public class Jugadores {

    public final int ID;
    public final String Nombre;
    public final String Equipo;
    public final int Dorsal;
    public final double Altura;

    /**
     * Constructor de la clase Jugadores.
     *
     * @param ID     Identificador del jugador.
     * @param nombre Nombre del jugador.
     * @param equipo Equipo al que pertenece el jugador.
     * @param dorsal Número de dorsal del jugador.
     * @param altura Altura del jugador.
     */
    public Jugadores(int ID, String nombre, String equipo, int dorsal, double altura) {
        this.ID = ID;
        this.Nombre = nombre;
        this.Equipo = equipo;
        this.Dorsal = dorsal;
        this.Altura = altura;
    }

    // Métodos de acceso

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getEquipo() {
        return Equipo;
    }

    public int getDorsal() {
        return Dorsal;
    }

    public double getAltura() {
        return Altura;
    }

    @Override
    public String toString() {
        return "Jugadores [ID=" + ID + ", Nombre=" + Nombre + ", Equipo=" + Equipo + ", Dorsal=" + Dorsal
                + ", Altura=" + Altura + "]";
    }
}
