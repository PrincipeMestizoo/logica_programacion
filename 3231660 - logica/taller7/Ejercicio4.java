package taller7;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite los metros:");
        int metro = scanner.nextInt();

        int centimetros = metro * 100;

        scanner.close();

        System.out.println("Los centimetros para " + metro + " metros es: " + centimetros);

    }
}
