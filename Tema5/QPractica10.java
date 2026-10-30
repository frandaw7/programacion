import java.util.Scanner;
public class QPractica10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = -1;
        while (numero < 0) {
            System.out.print("Introducir número entero positivo: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero < 0) {
                    System.out.println("Error: El número introducido no es positivo.");
                }
            } else {
                System.out.println("Error: Los caracteres introducidos no son un número entero.");
                scanner.next();
            }
        }
        int cifras = 0;
        if (numero == 0) {
            cifras = 1;
        } else {
            while (numero > 0) {
                numero = numero / 10;
                cifras++;
            }
        }
        System.out.println("El número en cuestión tiene " + cifras + " cifras.");
        scanner.close();
    }
}
