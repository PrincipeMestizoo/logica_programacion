package taller7;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el nombre del empleado:");
        String nombre = scanner.next();

        System.out.println("Digite las horas trabajadas:");
        int horas = scanner.nextInt();

        System.out.println("Digite el valor de la hora:");
        int valor = scanner.nextInt();

        int totalPagar = valor * horas;

        scanner.close();

        System.out.println("El total a pagar al empleado " + nombre + " es:" + "\n" + totalPagar);

    }
}
