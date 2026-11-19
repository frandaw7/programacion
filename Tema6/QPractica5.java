import java.util.Scanner;
public class QPractica5 {
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int contarDivisoresPrimos(int n) {
        int contador = 0;
        int numero = Math.abs(n);
        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0 && esPrimo(i)) {
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir un número entero: ");
        int numero = scanner.nextInt();
        int totalPrimos = contarDivisoresPrimos(numero);
        System.out.println("El número de divisores primos de " + numero + " es: " + totalPrimos);
        scanner.close();
    }
}
