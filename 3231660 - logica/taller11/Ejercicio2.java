package taller11;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Vienes con un adulto?");
        String vieneAdulto = entrada.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = entrada.nextInt();

        System.out.println("Ingresa tu estatura: ");
        int estatura = entrada.nextInt();

        entrada.close();

        if ((edad > 12 && estatura > 150) || (vieneAdulto.toLowerCase().equals("si"))) {
            System.out.println("Puedes ingresar a la atracción");
        } else {
            System.out.println("No puedes ingresar a la atracción");
        }
    }

}
