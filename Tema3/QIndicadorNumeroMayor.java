import java.util.Scanner;
public class QIndicadorNumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir número 1: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introducir número 2: ");
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.println("Número 1 es mayor.");
        } else if (numero2 > numero1) {
            System.out.println("Número 2 es mayor.");
        } else {
            System.out.println("Hay igualdad entre ambos números.");
        }
        scanner.close();
    }
}
