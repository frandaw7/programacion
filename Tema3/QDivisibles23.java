import java.util.Scanner;
public class QDivisibles23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir número: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("Es divisible por 2 y 3.");
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            System.out.println("Es divisible por 2 o 3.");
        }
        if (numero % 2 == 0 ^ numero % 3 == 0) {
            System.out.println("Es divisible por 2 o 3, pero no por ambos.");
        }
        scanner.close();
    }
}
