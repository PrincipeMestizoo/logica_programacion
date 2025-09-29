package taller9;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero >= 50) {
            if (numero <= 100) {
                System.out.println("Numero valido");
            } else {
                System.out.println("Numero invalido");
            }
        } else {
            System.out.println("Numero invalido");

        }

    }
}
