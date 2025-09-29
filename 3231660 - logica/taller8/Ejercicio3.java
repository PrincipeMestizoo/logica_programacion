package taller8;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();
        scanner.close();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");
        }

    }

}
