import java.util.Scanner;
public class QPracticaExtra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        boolean continuar = true;
        while (continuar) {
            System.out.print("Introducir número real positivo (0 para finalizar): ");
            if (scanner.hasNextDouble()) {
                double numero = scanner.nextDouble();
                if (numero == 0) {
                    continuar = false;
                } else if (numero > 0) {
                    suma += numero;
                    contador++;
                } else {
                    System.out.println("Error: El número introducido no puede ser negativo.");
                }
            } else {
                System.out.println("Error: Debes introducir un valor numérico válido.");
                scanner.next();
            }
        }
        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La suma de los números es: " + suma);
            System.out.println("La media aritmética es: " + media);
        } else {
            System.out.println("Error: No se introdujeron números positivos para calcular.");
        }
        scanner.close();
    }
}
