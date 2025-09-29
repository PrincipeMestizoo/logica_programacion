package taller8;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero >= 1) {
            if (numero <= 100) {
                System.out.println("Numero dentro de rango");
            } else {
                System.out.println("Numero fuera de rango");
            }
        } else {
            System.out.println("Numero fuera de rango");

        }

    }

}
