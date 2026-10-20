import java.util.Scanner;
public class QPractica5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir número binario (máximo de 8 cifras): ");
        String binario = scanner.next();
        int decimal = Integer.parseInt(binario, 2);
        System.out.println("El valor decimal es: " + decimal);
        scanner.close();
    }
}
