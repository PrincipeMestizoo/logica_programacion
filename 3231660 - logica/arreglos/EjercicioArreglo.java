package arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantas tareas desea agregar?");
        int numeroTareas = scanner.nextInt();
        
        String[] arreglo = new String[numeroTareas];
        int contador = 0;

        boolean repetirMenu = true;

        while (repetirMenu) {
            repetirMenu = false;

            System.out.println("\n" + "-----Menu-----");
            System.out.println("1- Agregar tarea");
            System.out.println("2- Listar tarea");
            System.out.println("3- Salir" + "\n");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n" + "Ingrese la tarea a almacenar:");
                    String tarea = scanner.nextLine();

                    if (contador < arreglo.length) {
                        arreglo[contador] = tarea;
                        contador++;
                        System.out.println("Tarea  añadida" + "\n");
                        repetirMenu = true;
                    } else {
                        System.out.println("No se pudo agregar la tarea, ya se alcanzo el limite" + "\n");
                        repetirMenu = false;
                    }

                    break;

                case 2:
                    System.out.println("\n" + "Imprimiendo lista");
                    System.out.println(Arrays.toString(arreglo));

                    System.out.println("Listado exitoso" + "\n");
                    repetirMenu = true;
                    break;

                case 3:
                    System.out.println("opcion 3 - vuelva pronto");
                    break;

                default:
                    System.out.println("\n" + "Opcion no valida" + "\n");
                    repetirMenu = true;
                    break;
            }

        }

        scanner.close();
    }
}