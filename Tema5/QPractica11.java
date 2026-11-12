import java.util.Scanner;
public class QPractica11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerosol = 0;
        while (numerosol <= 1) {
            System.out.print("Introducir número entero (>1): ");
            if (scanner.hasNextInt()) {
                numerosol = scanner.nextInt();
            } else {
                scanner.next();
            }
        }
        boolean nprimo = true;
        int div = 2;
        while (div * div <= numerosol) {
            if (numerosol % div == 0) {
                nprimo = false;
            }
            div++;
        }
        if (nprimo) {
            System.out.println("El número introducido: " + numerosol + " es primo.");
        } else {
            System.out.println("El número introducido: " + numerosol + " no es primo.");
        }
        scanner.close();
    }
}
