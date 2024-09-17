package instrucciones_secuenciales;

import java.util.Scanner;

public class Numero_De_La_Suerte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la fecha de nacimiento
        System.out.print("Ingrese el día de nacimiento: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes de nacimiento: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el año de nacimiento: ");
        int anio = scanner.nextInt();

        // Calcular el número de la suerte
        int numeroSuerte = dia + mes + anio;

        // Mostrar el número de la suerte
        System.out.println("Número de la suerte: " + numeroSuerte);
    }
}
