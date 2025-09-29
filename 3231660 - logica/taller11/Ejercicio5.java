package taller11;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿que tipo de cliente eres? Socio/invitado");
        String tipoCliente = entrada.nextLine();

        System.out.println("¿carta de recomendacion?");
        String carta = entrada.nextLine();

        System.out.println("Ingresa tu cuota: ");
        int cuota = entrada.nextInt();

        entrada.close();

        if ((tipoCliente.toLowerCase().equals("socio") && cuota > 500)
                || (tipoCliente.toLowerCase().equals("invitado") && carta.toLowerCase().equals("si"))) {
            System.out.println("Puedes ingresar al club");
        } else {
            System.out.println("No puedes ingresar al club");
        }
    }

}
