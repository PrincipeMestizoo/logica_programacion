package taller10;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.println("Contraseña");
        String contrasena = scanner.nextLine();

        scanner.close();

        if (usuario.toLowerCase().equals("admin")) {
            if (contrasena.toLowerCase().equals("1234")) {
                System.out.println("Bienvenido Admin :)");
            } else {
                System.out.println("Acceso denegado: Contraseña Incorrecta");
            }
        } else{
            System.out.println("Acceso no autorizado");
        }

    }
}
