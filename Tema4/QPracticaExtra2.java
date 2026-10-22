import java.util.Scanner;
public class QPracticaExtra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir número (2-7 dígitos): ");
        String entrada = scanner.next();
        if (entrada.length() >= 2 && entrada.length() <= 7 && entrada.matches("[0-9]+")) {
            System.out.println("Válido.");
        } else {
            System.out.println("Error: Texto contiene demasiada longitud / No contiene número.");
        }
        scanner.close();
    }
}
