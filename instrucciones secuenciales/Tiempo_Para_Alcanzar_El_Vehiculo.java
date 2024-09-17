package instrucciones_secuenciales;

import java.util.Scanner;

public class Tiempo_Para_Alcanzar_El_Vehiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar distancia y velocidades
        System.out.print("Ingrese la distancia entre los dos vehículos (km): ");
        double distancia = scanner.nextDouble();
        System.out.print("Ingrese la velocidad del vehículo más lento (km/h): ");
        double v1 = scanner.nextDouble();
        System.out.print("Ingrese la velocidad del vehículo más rápido (km/h): ");
        double v2 = scanner.nextDouble();

        // Calcular el tiempo en horas y convertir a minutos
        double tiempoHoras = distancia / (v2 - v1);
        double tiempoMinutos = tiempoHoras * 60;

        // Mostrar el tiempo
        System.out.printf("El vehículo más rápido alcanzará al más lento en %.2f minutos.%n", tiempoMinutos);
    }
}
