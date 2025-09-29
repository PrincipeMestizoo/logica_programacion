package taller7;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Digite el peso: ");
        int peso = scanner.nextInt();

        scanner.close();

        System.out.println("La edad es: " + edad);
        System.out.println("el peso es: " + peso);

    }
}
