package condicionales_y_repetitivos;
import java.util.Scanner;

public class SimuladorDeAhorro {
    public static double calcularMontoFinal(double inversionInicial, double tasaInteres, int anos) {
        return inversionInicial * Math.pow((1 + tasaInteres), anos);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la inversión inicial: ");
        double inversionInicial = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (en decimal): ");
        double tasaInteres = scanner.nextDouble();

        System.out.print("Ingrese el número de años: ");
        int anos = scanner.nextInt();

        double montoFinal = calcularMontoFinal(inversionInicial, tasaInteres, anos);
        System.out.printf("El monto final después de %d años es: %.2f%n", anos, montoFinal);
    }
}
