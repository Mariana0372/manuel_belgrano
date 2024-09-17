package instrucciones_secuenciales;

import java.util.Scanner;

public class Calculo_De_Comisiones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el sueldo base
        System.out.print("Ingrese el sueldo base del vendedor: ");
        double sueldoBase = scanner.nextDouble();

        // Solicitar el monto de las tres ventas
        System.out.print("Ingrese el monto de la primera venta: ");
        double venta1 = scanner.nextDouble();
        System.out.print("Ingrese el monto de la segunda venta: ");
        double venta2 = scanner.nextDouble();
        System.out.print("Ingrese el monto de la tercera venta: ");
        double venta3 = scanner.nextDouble();

        // Calcular la comisión total
        double totalVentas = venta1 + venta2 + venta3;
        double comision = totalVentas * 0.10;

        // Calcular el total a recibir
        double totalARecibir = sueldoBase + comision;

        // Mostrar resultados
        System.out.printf("Comisión total: %.2f%n", comision);
        System.out.printf("Total a recibir: %.2f%n", totalARecibir);
    }
}