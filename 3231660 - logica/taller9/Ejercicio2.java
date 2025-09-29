package taller9;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        int nota2 = scanner.nextInt();
        scanner.close();

        if (nota1 >= 6) {
            if (nota2 >= 6) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Debe recuperar");
            }
        } else {
            System.out.println("Debe recuperar");

        }

    }

}
