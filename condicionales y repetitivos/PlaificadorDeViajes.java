package condicionales_y_repetitivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlaificadorDeViajes {
    public static double calcularCostoTotal(List<Double> costos) {
        return costos.stream().mapToDouble(Double::doubleValue).sum();
    }

    public static int calcularDuracionTotal(List<Integer> duraciones) {
        return duraciones.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de destinos: ");
        int numDestinos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        List<String> destinos = new ArrayList<>();
        List<Double> costos = new ArrayList<>();
        List<Integer> duraciones = new ArrayList<>();

        for (int i = 0; i < numDestinos; i++) {
            System.out.print("Ingrese el destino " + (i + 1) + ": ");
            String destino = scanner.nextLine();
            destinos.add(destino);

            System.out.print("Ingrese el costo para " + destino + ": ");
            double costo = scanner.nextDouble();
            costos.add(costo);

            System.out.print("Ingrese la duración (días) para " + destino + ": ");
            int duracion = scanner.nextInt();
            duraciones.add(duracion);

            scanner.nextLine(); // Consumir el salto de línea
        }

        double totalCosto = calcularCostoTotal(costos);
        int totalDuracion = calcularDuracionTotal(duraciones);

        System.out.printf("El costo total del viaje es: %.2f%n", totalCosto);
        System.out.println("La duración total del viaje es: " + totalDuracion + " días");

        // Imprimir destinos para evitar la advertencia de contenido no usado
        System.out.println("Destinos incluidos en el viaje:");
        for (String destino : destinos) {
            System.out.println("- " + destino);
        }
    }
}
