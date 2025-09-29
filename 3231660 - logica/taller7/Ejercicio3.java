package taller7;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el radio del circulo: ");
        int radio = scanner.nextInt();

        double area = 3.1416 * (radio * radio);

        scanner.close();

        System.out.println("El área del circulo es: " + area);

    }
}
