import java.util.Scanner;
public class QPractica12 {
    public static void leerNumeros(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introducir el número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }
    public static int[] multiplicarPorDos(int[] array) {
        int[] resultado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultado[i] = array[i] * 2;
        }
        return resultado;
    }
    public static void mostrarNumeros(int[] array) {
        System.out.print("Números multiplicados por 2: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        leerNumeros(numeros, scanner);
        int[] numerosMultiplicados = multiplicarPorDos(numeros);
        mostrarNumeros(numerosMultiplicados);
        scanner.close();
    }
}
