package instrucciones_secuenciales;

import java.util.Scanner;

public class Calculo_De_Calificacion_Final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar calificaciones parciales
        System.out.print("Ingrese la primera calificación parcial: ");
        double parcial1 = scanner.nextDouble();
        System.out.print("Ingrese la segunda calificación parcial: ");
        double parcial2 = scanner.nextDouble();
        System.out.print("Ingrese la tercera calificación parcial: ");
        double parcial3 = scanner.nextDouble();

        // Solicitar calificaciones adicionales
        System.out.print("Ingrese la calificación del examen final: ");
        double examenFinal = scanner.nextDouble();
        System.out.print("Ingrese la calificación del trabajo final: ");
        double trabajoFinal = scanner.nextDouble();

        // Calcular el promedio de las calificaciones parciales
        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;

        // Calcular la calificación final
        double calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);

        // Mostrar la calificación final
        System.out.printf("Calificación final: %.2f%n", calificacionFinal);
    }
}