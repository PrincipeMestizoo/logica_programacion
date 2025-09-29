package taller10;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Sabe nadar?");
        String sabeNadar = scanner.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();

        scanner.close();

        if (edad >= 18) {
            if (sabeNadar.equals("si")) {
                System.out.println("Puedes ingresar a la piscina");
            } else {
                System.out.println("Debe usar flotador");
            }
        } else {
            System.out.println("Debes ir acompañado de un adulto");

        }

    }
}
