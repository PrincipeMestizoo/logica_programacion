package taller8;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero a clasificar: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }

    }

}
