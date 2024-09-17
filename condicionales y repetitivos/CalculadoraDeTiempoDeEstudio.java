package condicionales_y_repetitivos;

import java.util.Scanner;

public class CalculadoraDeTiempoDeEstudio {
    public static boolean verificarTiempoSuficiente(double tiempoTotalNecesario, double tiempoDisponible) {
        return tiempoDisponible >= tiempoTotalNecesario;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tiempo total necesario para estudiar (en horas): ");
        double tiempoTotalNecesario = scanner.nextDouble();

        System.out.print("Ingrese el tiempo disponible para estudiar (en horas): ");
        double tiempoDisponible = scanner.nextDouble();

        if (verificarTiempoSuficiente(tiempoTotalNecesario, tiempoDisponible)) {
            System.out.println("Tienes suficiente tiempo para estudiar.");
        } else {
            System.out.println("No tienes suficiente tiempo para estudiar.");
        }
    }
}
