import java.util.Scanner;
public class QPractica6 {
    public static void leerNumeros(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introducir el número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }
    public static void mostrarInverso(int[] array) {
        System.out.print("Números en orden inverso: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        leerNumeros(numeros, scanner);
        mostrarInverso(numeros);
        scanner.close();
    }
}
