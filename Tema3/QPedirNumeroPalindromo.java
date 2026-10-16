import java.util.Scanner;
public class QPedirNumeroPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir un número entre 0 y 99.999: ");
        int numeroprin = scanner.nextInt();
        if (numeroprin >= 0 && numeroprin <= 99999) {
            int numero = numeroprin;
            int ninver = 0;
            if (numero > 0) {
                ninver = (ninver * 10) + (numero % 10);
                numero = numero / 10;
            }
            if (numero > 0) {
                ninver = (ninver * 10) + (numero % 10);
                numero = numero / 10;
            }
            if (numero > 0) {
                ninver = (ninver * 10) + (numero % 10);
                numero = numero / 10;
            }
            if (numero > 0) {
                ninver = (ninver * 10) + (numero % 10);
                numero = numero / 10;
            }
            if (numero > 0) {
               ninver = (ninver * 10) + (numero % 10);
                numero = numero / 10;
            }
            if (numeroprin == ninver) {
                System.out.println("Es palíndromo.");
            } else {
                System.out.println("No es palíndromo.");
            }
        } else {
            System.out.println("Supera el límite permitido.");
        }
        scanner.close();
    }
}
