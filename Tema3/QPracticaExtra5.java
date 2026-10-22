import java.util.Scanner;
public class QPracticaExtra5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nota Control 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota Control 2: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 5) {
            System.out.println("Nota Programación: " + media);
        } else {
            System.out.print("Resultado recuperación (Apto / No apto): ");
            String recuperacion = scanner.next();
            if (recuperacion.equals("Apto")) {
                System.out.println("Nota Programación: 5");
            } else {
                System.out.println("Nota Programación: " + media);
            }
        }
        scanner.close();
    }
}
