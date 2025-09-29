package taller11;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿El cliente es frecuente?");
        String tipoCliente = entrada.nextLine();

        System.out.println("Ingrese el valor de la compra: ");
        int compra = entrada.nextInt();

        entrada.close();

        if (compra >= 100 && tipoCliente.toLowerCase().equals("si") || (compra > 200)) {
            System.out.println("Tiene descuento del 20%");
        } else {
            System.out.println("No aplica para descuento");
        }
    }
}
