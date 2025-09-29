package taller10;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Tiene dinero?");
        String tieneDinero = scanner.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();

        scanner.close();

        if (edad >= 15) {
            if (tieneDinero.equals("si")) {
                System.out.println("Puedes comprar la entrada e ingresar a la pelicula");
            } else {
                System.out.println("No puedes entrar, no tienes dinero");
            }
        } else {
            System.out.println("Debes ir acompañado de un adulto");

        }

    }
}
