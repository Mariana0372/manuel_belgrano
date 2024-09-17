package condicionales_y_repetitivos;
import java.util.Scanner;

public class CalculadoraDeCalorias {
    public static double calcularDiferencia(double caloriasDiarias, double objetivoCalorias) {
        return caloriasDiarias - objetivoCalorias;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el total de calorías consumidas hoy: ");
        double caloriasDiarias = scanner.nextDouble();

        System.out.print("Ingrese el objetivo de calorías para el día: ");
        double objetivoCalorias = scanner.nextDouble();

        double diferencia = calcularDiferencia(caloriasDiarias, objetivoCalorias);
        if (diferencia <= 0) {
            System.out.println("Estás dentro del rango saludable.");
        } else {
            System.out.printf("Excedes el rango saludable por: %.2f calorías%n", diferencia);
        }
    }
}

