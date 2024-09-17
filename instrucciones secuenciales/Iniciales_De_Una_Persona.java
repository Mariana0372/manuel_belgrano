package instrucciones_secuenciales;

import java.util.Scanner;

public class Iniciales_De_Una_Persona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre y apellidos
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el primer apellido: ");
        String apellido1 = scanner.nextLine();
        System.out.print("Ingrese el segundo apellido: ");
        String apellido2 = scanner.nextLine();

        // Obtener las iniciales
        char inicialNombre = nombre.charAt(0);
        char inicialApellido1 = apellido1.charAt(0);
        char inicialApellido2 = apellido2.charAt(0);

        // Mostrar las iniciales
        System.out.printf("Iniciales: %c.%c.%c.%n", inicialNombre, inicialApellido1, inicialApellido2);
    }
}