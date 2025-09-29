package taller7;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la base del triángulo");
        int base = scanner.nextInt();

        System.out.println("Digite la altura del triángulo: ");
        int altura = scanner.nextInt();

        int area = (base * altura) / 2;

        scanner.close();

        System.out.println("El área del triángulo es: " + area);

    }
}
