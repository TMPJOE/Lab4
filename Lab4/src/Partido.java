public class Partido {
    private final Jugador[] jugadores;
    private final int cambios;
    public Partido(Jugador[] jugadores, int cambios) {
        this.jugadores = jugadores;
        this.cambios = cambios;
    }

    public double sacarPromedio() {
        int suma = 0;
        for (int i = 0; i < 11 + cambios; i++) {
            suma += jugadores[i].getCalificacion();
        }
         return  (double) suma / jugadores.length;
    }
}
