package taller8;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero a clasificar: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero > 0) {
            System.out.println("El numero " + numero + " es postivo");
        } else if (numero == 0) {
            System.out.println("El numero es cero (0)");
        } else {
            System.out.println("El numero " + numero + " es negativo");
        }

    }

}
