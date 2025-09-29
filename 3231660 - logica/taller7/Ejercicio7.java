package taller7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nota 1: ");
        int nota1 = scanner.nextInt();

        System.out.println("Ingrese nota 2: ");
        int nota2 = scanner.nextInt();

        System.out.println("Ingrese nota 3: ");
        int nota3 = scanner.nextInt();

        System.out.println("Ingrese nota 4: ");
        int nota4 = scanner.nextInt();

        int promedio = (nota1 + nota2 + nota3 + nota4);
        int definitiva = promedio / 4;

        scanner.close();

        System.out.println("La definitiva es: " + definitiva);
    }
}
