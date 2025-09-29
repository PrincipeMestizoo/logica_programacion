package taller7;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el numero de respuestas correctas:");
        int correctas = scanner.nextInt();

        System.out.println("Digite el numero de respuestas incorrectas:");
        int incorrectas = scanner.nextInt();

        System.out.println("Digite el numero de respuestas en blanco:");
        int enBlanco = scanner.nextInt();

        int resultado = (correctas * 4) + (incorrectas * -1) + (enBlanco * 0);

        scanner.close();

        System.out.println("puntaje final: " + resultado);

    }
}
