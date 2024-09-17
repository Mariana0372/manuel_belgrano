package condicionales_y_repetitivos;

public class Palindromo {
    public static void main(String[] args) {
        String palabra = "radar";
        String palabraReversa = new StringBuilder(palabra).reverse().toString();

        if (palabra.equals(palabraReversa)) {
            System.out.println(palabra + " es un palíndromo.");
        } else {
            System.out.println(palabra + " no es un palíndromo.");
        }
    }
}

