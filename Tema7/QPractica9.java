import java.util.Scanner;
public class QPractica9 {
    public static void leerNumeros(double[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introducir el número " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }
    }
    public static void mostrarMedia(double[] array) {
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        double media = suma / array.length;
        System.out.println("La media de los números introducidos es: " + media);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        leerNumeros(numeros, scanner);
        mostrarMedia(numeros);
        scanner.close();
    }
}
