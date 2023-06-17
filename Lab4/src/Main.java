import java.util.Random;
import java.util.Scanner;

public class Main {
    /*Un equipo de fútbol está en problemas, así que sus dueños han decidido que
seguirán sosteniéndolo si el promedio de las calificaciones de sus jugadores,
después de cada partido es superior a 6, y le han contratado para que elabore un
programa que pida las calificaciones individuales y devuelva el promedio de ellas.
Recuerde que juegan once jugadores y que puede haber hasta tres cambios, así
que mínimo debe pedir once calificaciones y máximo 14*/
    public static void main(String[] args) {
        Jugador[] jugadores = new Jugador[14];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int cambios;
        Partido partido;

        System.out.print("¿Cuántos cambios hubo en el partido? ");
        cambios = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < 11+cambios; i++) {
            //System.out.print("Nombre del jugador " + (i + 1) + ": ");
            String nombre = String.valueOf(random.nextInt(100));
            //System.out.print("Calificación del jugador " + (i + 1) + ": ");
            int calificacion = random.nextInt(1,11);
            jugadores[i] = new Jugador(nombre, calificacion);
        }



        partido = new Partido(jugadores, cambios);

        System.out.println("El promedio del equipo es: " + partido.sacarPromedio());

        if (partido.sacarPromedio() >= 6) {
            System.out.println("El equipo se queda");
        } else {
            System.out.println("El equipo se va");
        }

    }
}