import java.util.Scanner;
public class QPracticaExtra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir cadena de caracteres (únicamente letras): ");
        String cadenaCar = scanner.nextLine();
        if (cadenaCar.trim().isEmpty()) {
            System.out.println("Error: No hay caracteres.");
        } else {
            int totalVocales = 0;
            String vocales = "aeiouáéíóúüAEIOUÁÉÍÓÚÜ";
            boolean Error = false;
            for (int i = 0; i < cadenaCar.length(); i++) {
                char caracterA = cadenaCar.charAt(i);
                if (Character.isDigit(caracterA)) {
                    Error = true;
                    break;
                }
                if (vocales.indexOf(caracterA) != -1) {
                    totalVocales++;
                }
            }
            if (Error) {
                System.out.println("Error: No se permiten números, únicamente letras.");
            } else {
                System.out.println("El número de vocales en la cadena de caracteres es: " + totalVocales);
            }
        }
        scanner.close();
    }
}
