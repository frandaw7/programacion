import java.util.Scanner;
public class QMayoriaEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir edad: ");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Mayor de edad.");
        } else {
            System.out.println("No mayor de edad.");
        }
        scanner.close();
    }
}
