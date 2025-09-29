import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese hasta que numero desea hacer el factorial: ");
        int numero = scanner.nextInt();

        scanner.close();

        int factorial = 1;
        String serie = "";
        for (int i = 1; i <= numero; i++) {
            factorial = i * factorial;
            if (i == numero) {
                serie += + i + "";
            }else{
                serie += + i + " * ";
            }
        }
        System.out.println(serie);
        System.out.println("Resultado: " + factorial);
    }
}