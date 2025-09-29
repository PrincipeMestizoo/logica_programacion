package taller8;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero a clasificar: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero % 5 == 0) {
            System.out.println("El numero " + numero + " es multiplo de 5");
        } else {
            System.out.println("El numero " + numero + " no es multiplo de 5");
        }

    }

}
