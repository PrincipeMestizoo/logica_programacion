package taller9;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero < 100) {
            if (numero > 0) {
                System.out.println("Numero dentro de rango");
            } else {
                System.out.println("Numero fuera de rango");
            }
        } else {
            System.out.println("Numero fuera de rango");

        }

    }
    
}
