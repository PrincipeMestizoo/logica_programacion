package taller11;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Registre el valor de sus ingresos: ");
        int ingresos = entrada.nextInt();

        System.out.println("Años de trabajo estable: ");
        int trabajoEstable = entrada.nextInt();

        entrada.close();

        if ((ingresos >= 2000 && trabajoEstable > 2) || ingresos >= 5000) {
            System.out.println("Aplicas para el préstamo");
        } else {
            System.out.println("No aplicas para el préstamo");
        }
    }

}
