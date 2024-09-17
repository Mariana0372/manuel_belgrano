package condicionales_y_repetitivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlanificadorDeEstudio {
    public static double calcularTiempoPorTarea(double totalTiempo, List<String> tareas) {
        return totalTiempo / tareas.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tiempo total disponible para estudiar (en horas): ");
        double totalTiempo = scanner.nextDouble();

        System.out.print("Ingrese el número de tareas o temas a estudiar: ");
        int numTareas = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        List<String> tareas = new ArrayList<>();
        for (int i = 0; i < numTareas; i++) {
            System.out.print("Ingrese el nombre de la tarea " + (i + 1) + ": ");
            String tarea = scanner.nextLine();
            tareas.add(tarea);
        }

        double tiempoPorTarea = calcularTiempoPorTarea(totalTiempo, tareas);
        System.out.printf("Dedica aproximadamente %.2f horas a cada tarea o tema.%n", tiempoPorTarea);
    }
}
