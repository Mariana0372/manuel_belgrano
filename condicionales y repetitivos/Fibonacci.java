package condicionales_y_repetitivos;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        System.out.println("Los primeros 10 números de la serie Fibonacci son:");

        for (int i = 1; i <= 10; i++) {
            System.out.print(num1 + " ");
            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }
    }
}

