import java.util.Arrays;
import java.util.Scanner;
public class QPractica10 {
    public static void leerNumeros(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introducir el número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }
    public static void ordenarYMostrar(int[] array) {
        Arrays.sort(array);
        System.out.print("Números ordenados de forma ascendente: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        leerNumeros(numeros, scanner);
        ordenarYMostrar(numeros);
        scanner.close();
    }
}
