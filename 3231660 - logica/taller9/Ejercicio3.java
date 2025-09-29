package taller9;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Es de noche?");
        String esDeNoche = scanner.nextLine();
        System.out.println("¿Es fin de semana?");
        String esFinDeSemana = scanner.nextLine();
        scanner.close();

        if (esDeNoche.equals("si")) {
            if (esFinDeSemana.equals("si")) {
                System.out.println("Puedes descansar");
            } else {
                System.out.println("Puedes descansar");
            }
        } else {
            if (esFinDeSemana.equals("si")) {
                System.out.println("Puedes descansar");
            } else {
                System.out.println("No Puedes descansar");
            }
        }

    }

}
