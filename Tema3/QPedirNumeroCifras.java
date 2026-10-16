import java.util.Scanner;
public class QPedirNumeroCifras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entre 0 y 9.999: ");
        int numero = scanner.nextInt();
        if (numero >= 0 && numero <= 9) {
            System.out.println("1 cifra.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("2 cifras.");
        } else if (numero >= 100 && numero <= 999) {
            System.out.println("3 cifras.");
        } else if (numero >= 1000 && numero <= 9999) {
            System.out.println("4 cifras.");
        } else {
            System.out.println("Supera el límite permitido.");
        }
        scanner.close();
    }
}
