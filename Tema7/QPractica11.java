import java.util.Scanner;
public class QPractica11 {

    public static void leerNumeros(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introducir el número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }
    public static int[] combinarArrays(int[] array1, int[] array2) {
        int[] combinado = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            combinado[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            combinado[array1.length + i] = array2[i];
        }
        return combinado;
    }
    public static void mostrarNumeros(int[] array) {
        System.out.print("Números almacenados en el tercer array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        leerNumeros(array1, scanner);
        leerNumeros(array2, scanner);
        int[] array3 = combinarArrays(array1, array2);
        mostrarNumeros(array3);
        scanner.close();
    }
}
