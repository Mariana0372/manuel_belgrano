package instrucciones_secuenciales;

import java.util.Scanner;

public class Intercambio_De_Valores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar valores A y B
        System.out.print("Ingrese el valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el valor de B: ");
        int b = scanner.nextInt();

        // Intercambiar valores
        int temp = a;
        a = b;
        b = temp;

        // Mostrar resultados
        System.out.println("Valor de A después del intercambio: " + a);
        System.out.println("Valor de B después del intercambio: " + b);
    }
}
