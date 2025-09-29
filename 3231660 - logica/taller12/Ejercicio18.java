import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite que numero de tabla desear imprimir: ");
        int numero = scanner.nextInt();

        scanner.close();
        
        System.out.println("Tabla del " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" X " + numero + " = " + i*numero);
        }
    }
}
