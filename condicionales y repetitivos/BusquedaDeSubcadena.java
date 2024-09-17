package condicionales_y_repetitivos;

import java.util.Scanner;

public class BusquedaDeSubcadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el texto y la subcadena
        System.out.print("Ingrese el texto: ");
        String texto = scanner.nextLine();

        System.out.print("Ingrese la subcadena a buscar: ");
        String subcadena = scanner.nextLine();

        // Verificar si la subcadena está contenida en el texto
        if (texto.contains(subcadena)) {
            System.out.println("La subcadena '" + subcadena + "' se encuentra en el texto.");
        } else {
            System.out.println("La subcadena '" + subcadena + "' no se encuentra en el texto.");
        }

        scanner.close();
    }
}
