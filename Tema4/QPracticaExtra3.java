import java.util.Scanner;
public class QPracticaExtra3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir nombre: ");
        String nombre = scanner.next();
        System.out.print("Introducir primer apellido: ");
        String apellido1 = scanner.next();
        System.out.print("Introducir segundo apellido: ");
        String apellido2 = scanner.next();
        System.out.println("Info: " + nombre + " " + apellido1 + " " + apellido2);
        scanner.close();
    }
}
