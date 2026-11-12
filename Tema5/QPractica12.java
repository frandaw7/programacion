import java.util.Scanner;
public class QPractica12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n < 1) {
            System.out.print("Introducir tamaño cuadrado (N>0): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            } else {
                scanner.next();
            }
        }
        int fila = 1;
        while (fila <= n) {
            int columna = 1;
            while (columna <= n) {
                System.out.print(columna);
                columna++;
            }
            System.out.println();
            fila++;
        }
        scanner.close();
    }
}
