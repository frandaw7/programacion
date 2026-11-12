import java.util.Scanner;
public class QPracticaExtra3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean encontrado14 = false;
        boolean continuar = true;
        while (continuar) {
            System.out.print("Introducir número entero (27 para finalizar): ");
            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                if (numero == 27) {
                    continuar = false;
                } else if (numero == 14) {
                    encontrado14 = true;
                }
            } else {
                System.out.println("Error: Debes introducir un número entero válido.");
                scanner.next();
            }
        }
        if (encontrado14) {
            System.out.println("El número 14 sí fue introducido en la secuencia.");
        } else {
            System.out.println("El número 14 no fue introducido en la secuencia.");
        }
        scanner.close();
    }
}
