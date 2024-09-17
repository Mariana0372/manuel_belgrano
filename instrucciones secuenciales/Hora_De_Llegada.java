package instrucciones_secuenciales;

import java.util.Scanner;

public class Hora_De_Llegada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar hora, minuto y segundo de salida
        System.out.print("Ingrese la hora de partida (HH): ");
        int horas = scanner.nextInt();
        System.out.print("Ingrese los minutos de partida (MM): ");
        int minutos = scanner.nextInt();
        System.out.print("Ingrese los segundos de partida (SS): ");
        int segundos = scanner.nextInt();

        // Solicitar el tiempo de viaje en segundos
        System.out.print("Ingrese el tiempo de viaje en segundos: ");
        int tiempoSegundos = scanner.nextInt();

        // Convertir la hora, minuto y segundo de partida a segundos
        int tiempoPartidaSegundos = horas * 3600 + minutos * 60 + segundos;

        // Calcular la hora de llegada en segundos
        int tiempoLlegadaSegundos = tiempoPartidaSegundos + tiempoSegundos;

        // Convertir el tiempo de llegada a horas, minutos y segundos
        int horasLlegada = tiempoLlegadaSegundos / 3600;
        int minutosLlegada = (tiempoLlegadaSegundos % 3600) / 60;
        int segundosLlegada = tiempoLlegadaSegundos % 60;

        // Mostrar la hora de llegada
        System.out.printf("Hora de llegada: %02d:%02d:%02d%n", horasLlegada, minutosLlegada, segundosLlegada);
    }
}
