package taller11;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad = entrada.nextInt();

        System.out.println("Ingresa los años de experiencia: ");
        int experiencia = entrada.nextInt();

        entrada.close();

        if ((edad > 25 && experiencia > 5) || (edad > 30)) {
            System.out.println("Aplicas para la licencia");
        } else {
            System.out.println("No aplicas para la licencia");
        }
    }
}
