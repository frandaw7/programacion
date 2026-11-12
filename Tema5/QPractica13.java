import java.util.Scanner;
public class QPractica13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Introducir número de columnas: ");
        int columnas = scanner.nextInt();
        System.out.println("\nMatriz:");
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                int resultado = i * j;
                System.out.print(resultado + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
