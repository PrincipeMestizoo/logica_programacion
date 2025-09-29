package taller11;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad = entrada.nextInt();

        System.out.println("Ingresa tu rating: ");
        int rating = entrada.nextInt();

        entrada.close();

        if ((rating > 1800 && edad > 15 ) || rating > 200) {
            System.out.println("Aplicas para la inscripción");
        } else {
            System.out.println("No plicas para la inscripción");
        }
    }
}
