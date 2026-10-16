import java.util.Scanner;
public class QOrdenNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir número 1: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introducir número 2: ");
        int numero2 = scanner.nextInt();
        System.out.print("Introducir número 3: ");
        int numero3 = scanner.nextInt();
        if (numero1 <= numero2 && numero2 <= numero3) {
            System.out.println("Orden números: " + numero1 + ", " + numero2 + ", " + numero3);
        } else if (numero1 <= numero3 && numero3 <= numero2) {
            System.out.println("Orden números: " + numero1 + ", " + numero3 + ", " + numero2);
        } else if (numero2 <= numero1 && numero1 <= numero3) {
            System.out.println("Orden números: " + numero2 + ", " + numero1 + ", " + numero3);
        } else if (numero2 <= numero3 && numero3 <= numero1) {
            System.out.println("Orden números: " + numero2 + ", " + numero3 + ", " + numero1);
        } else if (numero3 <= numero1 && numero1 <= numero2) {
            System.out.println("Orden números: " + numero3 + ", " + numero1 + ", " + numero2);
        } else {
            System.out.println("Orden números: " + numero3 + ", " + numero2 + ", " + numero1);
        }
        scanner.close();
    }
}
