package condicionales_y_repetitivos;

import java.util.Scanner;

public class SimuladorDePrestamoEstudiantil {
    public static double calcularPagoMensual(double montoPrestamo, double tasaInteres, int anos, int pagosPorAno) {
        double tasaMensual = tasaInteres / pagosPorAno;
        int numeroPagos = anos * pagosPorAno;
        return montoPrestamo * (tasaMensual * Math.pow((1 + tasaMensual), numeroPagos)) / (Math.pow((1 + tasaMensual), numeroPagos) - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto del préstamo: ");
        double montoPrestamo = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (en decimal): ");
        double tasaInteres = scanner.nextDouble();

        System.out.print("Ingrese el número de años para el préstamo: ");
        int anos = scanner.nextInt();

        System.out.print("Ingrese el número de pagos por año (e.g., 12 para pagos mensuales): ");
        int pagosPorAno = scanner.nextInt();

        double pagoMensual = calcularPagoMensual(montoPrestamo, tasaInteres, anos, pagosPorAno);
        System.out.printf("El pago mensual es: %.2f%n", pagoMensual);
    }
}
