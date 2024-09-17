package condicionales_y_repetitivos;

public class ContadorDeDigitos {
    public static void main(String[] args) {
        int numero = 123456;
        int contador = String.valueOf(numero).length();

        System.out.println("Número de dígitos en " + numero + " es: " + contador);
    }
}
