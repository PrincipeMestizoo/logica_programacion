package taller11;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dia de la semana");
        String dia = entrada.nextLine();

        System.out.println("¿Paga con tarjeta?");
        String tarjeta = entrada.nextLine();

        System.out.println("Ingrese el valor de la compra: ");
        int compra = entrada.nextInt();

        entrada.close();

        if (compra > 50 && (dia.toLowerCase().equals("lunes") || dia.toLowerCase().equals("viernes"))
                || (tarjeta.toLowerCase().equals("si"))) {
            System.out.println("Aplicas para el sorteo");
        } else {
            System.out.println("No aplica para el sorteo");
        }
    }
}
