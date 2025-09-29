package taller11;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu promedio: ");
        int promedio = entrada.nextInt();

        System.out.println("Ingresa tu estrato: ");
        int estrato = entrada.nextInt();

        entrada.close();

        if ((promedio >= 90 && (estrato == 1 || estrato == 2)) || (promedio >= 95)) {
            System.out.println("Aplicas para la Beca");
        } else {
            System.out.println("No aplicas para la Beca");
        }
    }

}
