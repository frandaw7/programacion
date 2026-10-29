import java.util.Scanner;
public class QPractica8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;
        do {
            System.out.print("Introducir número entero (al insertar 0, el programa termina): ");
            numero = scanner.nextInt();
            suma += numero;
        } while (numero != 0);
        System.out.println("Resultado: " + suma);
        scanner.close();
    }
}
