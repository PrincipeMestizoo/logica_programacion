package arreglos;

import java.util.Scanner;

public class Mascotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombrePropietario = sc.nextLine();

        System.out.println("Bienvenido " + nombrePropietario + ", Ingrese la cantidad de mascotas:");
        int numeroMascotas = sc.nextInt();
        sc.nextLine();

        int posicionMascota = 0;
        String[] mascotas = new String[numeroMascotas];
        boolean repetirMenu = true;

        while (repetirMenu) {
            repetirMenu = false;

            System.out.println("\n" + "-----Menu para las mascotas de " + nombrePropietario + "-----");
            System.out.println("1- Agregar mascota");
            System.out.println("2- Listar mascotas");
            System.out.println("3- Vacunar mascota");
            System.out.println("4- Salir" + "\n");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (posicionMascota < mascotas.length) {
                        System.out.println("\n" + "Ingrese el nombre de la mascota:");
                        String mascota = sc.nextLine();
                        mascotas[posicionMascota] = mascota;
                        posicionMascota++;
                        System.out.println("---Mascota registrada con exito---");
                        repetirMenu = true;
                    } else {
                        System.out.println("No se pudo agregar la mascota, ya se alcanzo el limite");
                        repetirMenu = false;
                    }
                    break;

                case 2:
                    System.out.println("Lista de mascotas de " + nombrePropietario + ":");
                    for (int i = 0; i < mascotas.length; i++) {
                        System.out.println(i + 1 + "- " + mascotas[i]);
                    }
                    repetirMenu = true;
                    break;

                case 3:
                    for (int i = 0; i < mascotas.length; i++) {
                        System.out.println(i + 1 + "- " + mascotas[i]);
                    }
                    System.out.println("¿Que mascota desea vacunar?");
                    int mascotaVacunar = sc.nextInt() - 1;
                    sc.nextLine();
                    System.out.println("\n" + mascotas[mascotaVacunar] + " vacunado con exito" + "\n");
                    repetirMenu = true;
                    break;

                case 4:
                    System.out.println("Vuelva pronto :)");
                    break;

                default:
                    System.out.println("\n" + "Opcion no valida" + "\n");
                    repetirMenu = true;
                    break;
            }

        }

        sc.close();
    }
}
