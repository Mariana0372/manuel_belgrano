package condicionales_y_repetitivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlanificadorDeActividadesDeportivas {
    public static double calcularActividadesPorDia(List<String> actividades, int dias) {
        return (double) actividades.size() / dias;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de días a la semana para actividades deportivas: ");
        int dias = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el número de actividades deportivas planificadas: ");
        int numActividades = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        List<String> actividades = new ArrayList<>();
        for (int i = 0; i < numActividades; i++) {
            System.out.print("Ingrese la actividad " + (i + 1) + ": ");
            String actividad = scanner.nextLine();
            actividades.add(actividad);
        }

        double actividadesPorDia = calcularActividadesPorDia(actividades, dias);
        System.out.printf("Puedes planificar aproximadamente %.2f actividades por día.%n", actividadesPorDia);
    }
}

