import java.util.Scanner;
public class QPractica7 {
    public static void leerNumeros(double[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introducir el número " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }
    }
    public static void mostrarOperaciones(double[] array) {
        double suma = array[0];
        double resta = array[0];
        double multiplicacion = array[0];
        double division = array[0];
        for (int i = 1; i < array.length; i++) {
            suma += array[i];
            resta -= array[i];
            multiplicacion *= array[i];
            if (array[i] != 0) {
                division /= array[i];
            }
        }
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        leerNumeros(numeros, scanner);
        mostrarOperaciones(numeros);
        scanner.close();
    }
}
