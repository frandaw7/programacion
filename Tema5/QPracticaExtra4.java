import java.util.Scanner;
public class QPracticaExtra4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir un número entero positivo N: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n >= 0) {
                long factorial = 1;
                for (int i = 1; i <= n; i++) {
                    factorial *= i;
                }
                System.out.println("El factorial de " + n + " es: " + factorial);
            } else {
                System.out.println("Error: El número no puede ser negativo.");
            }
        } else {
            System.out.println("Error: Debes introducir un número entero válido.");
        }
        scanner.close();
    }
}
