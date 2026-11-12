import java.util.Scanner;
public class QPracticaExtra5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir un número entero positivo: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n >= 1) {
                long factorial = 1;
                for (int i = 1; i <= n; i++) {
                    factorial *= i;
                    System.out.println("El factorial de " + i + " es: " + factorial);
                }
            } else {
                System.out.println("Error: El número debe ser un entero positivo mayor o igual a 1.");
            }
        } else {
            System.out.println("Error: Debes introducir un número entero válido.");
        }
        scanner.close();
    }
}
