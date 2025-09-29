package taller10;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el promedio del estudiante: ");
        int promedio = scanner.nextInt();
        System.out.println("Estrato socioeconomico");
        int estrato = scanner.nextInt();

        scanner.close();

        if (promedio >= 9) {
            if (estrato < 3) {
                System.out.println("Beca al 100%");
            } else {
                System.out.println("Beca al 50%");
            }
        } else {
            System.out.println("No aplica para beca");
        }

    }

}
