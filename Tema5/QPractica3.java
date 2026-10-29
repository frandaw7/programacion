import java.util.Scanner;
public class QPractica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = -1;
        while (nota < 0 || nota > 10) {
            System.out.print("Introducir nota (0-10): ");
            nota = scanner.nextDouble();            
            if (nota < 0 || nota > 10) {
                System.out.println("Error: La nota debe estar contemplada entre 0 y 10.");
            }
        }
        if (nota >= 9) {
            System.out.println("Sobresaliente");
        } else if (nota >= 7) {
            System.out.println("Notable");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota >= 5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
        scanner.close();
    }
}
