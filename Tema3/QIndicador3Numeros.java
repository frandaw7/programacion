import java.util.Scanner;
public class QIndicador3Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir número 1: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introducir número 2: ");
        int numero2 = scanner.nextInt();
        System.out.print("Introducir número 3: ");
        int numero3 = scanner.nextInt();
        if (numero1 <= numero2 && numero1 <= numero3) {
            System.out.println("El número más pequeño es: " + numero1);
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            System.out.println("El número más pequeño es: " + numero2);
        } else {
            System.out.println("El número más pequeño es: " + numero3);
        }
        scanner.close();
    }
}
