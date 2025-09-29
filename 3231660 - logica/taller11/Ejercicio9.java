package taller11;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Certificado medico vigente?");
        String certificado = entrada.nextLine();

        System.out.println("¿Usted fuma?");
        String fumar = entrada.nextLine();

        if (certificado.toLowerCase().equals("si") && (fumar.toLowerCase().equals("no"))) {
            System.out.println("Aceptado");
        } else {
            System.out.println("¿Cuenta con un permiso especial del comité médico?");
            String permiso = entrada.nextLine();
            entrada.close();
            if (permiso.toLowerCase().equals("si")) {
                System.out.println("Aceptado");
            } else {
                System.out.println("No aceptado");
            }
        }
    }
}
