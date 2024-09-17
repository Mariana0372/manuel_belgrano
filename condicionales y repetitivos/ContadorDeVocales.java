package condicionales_y_repetitivos;

public class ContadorDeVocales {
    public static void main(String[] args) {
        String texto = "Hola Mundo";
        int contador = 0;

        for (char c : texto.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        System.out.println("Número de vocales en el texto: " + contador);
    }
}
