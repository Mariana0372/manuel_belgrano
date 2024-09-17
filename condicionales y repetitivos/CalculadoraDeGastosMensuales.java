package condicionales_y_repetitivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraDeGastosMensuales {
    public static double calcularDiferencia(double ingresos, List<Double> gastos) {
        double totalGastos = gastos.stream().mapToDouble(Double::doubleValue).sum();
        return ingresos - totalGastos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ingreso mensual: ");
        double ingresos = scanner.nextDouble();

        System.out.print("Ingrese el número de categorías de gastos: ");
        int numGastos = scanner.nextInt();

        List<Double> gastos = new ArrayList<>();
        for (int i = 0; i < numGastos; i++) {
            System.out.print("Ingrese el gasto para categoría " + (i + 1) + ": ");
            double gasto = scanner.nextDouble();
            gastos.add(gasto);
        }

        double diferencia = calcularDiferencia(ingresos, gastos);
        if (diferencia >= 0) {
            System.out.printf("Estás dentro del presupuesto. Dinero restante: %.2f%n", diferencia);
        } else {
            System.out.printf("Excedes el presupuesto por: %.2f%n", -diferencia);
        }
    }
}
