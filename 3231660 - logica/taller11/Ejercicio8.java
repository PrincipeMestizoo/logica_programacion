package taller11;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu tiempo en la compañia (en meses): ");
        int tiempoEmpresa = entrada.nextInt();

        System.out.println("Ingresa las gigas que consumes: ");
        int gigasConsumidas = entrada.nextInt();

        entrada.close();

        if ((tiempoEmpresa > 12 && gigasConsumidas > 10) || tiempoEmpresa > 24) {
            System.out.println("Aplicas para el plan");
        } else {
            System.out.println("No Aplicas para el plan");
        }
    }

}
