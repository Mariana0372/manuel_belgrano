package instrucciones_secuenciales;

import java.util.Scanner;

public class Calculo_De_Nota_Final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar número de respuestas
        System.out.print("Ingrese el número de respuestas correctas: ");
        int correctas = scanner.nextInt();
        System.out.print("Ingrese el número de respuestas incorrectas: ");
        int incorrectas = scanner.nextInt();
        System.out.print("Ingrese el número de respuestas en blanco: ");

        // Calcular la nota
        int nota = (correctas * 5) - (incorrectas);

        // Mostrar la nota
        System.out.println("Nota final: " + nota);
    }
}
