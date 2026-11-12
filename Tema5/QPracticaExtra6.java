import java.util.Scanner;
public class QPracticaExtra6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir el límite inferior (M): ");
        if (scanner.hasNextInt()) {
            int m = scanner.nextInt();
            System.out.print("Introducir el límite superior (N): ");
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (m > 0 && n >= m) {
                    System.out.println("Números primos entre " + m + " y " + n + ":");
                    for (int p = m; p <= n; p++) {
                        int sumaDivisores = 0;
                        for (int d = 1; d <= p; d++) {
                            if (p % d == 0) {
                                sumaDivisores += d;
                            }
                        }
                        if (sumaDivisores == p + 1) {
                            System.out.println(p);
                        }
                    }
                } else {
                    System.out.println("Error: M debe ser mayor que 0 y N debe ser mayor o igual que M.");
                }
            } else {
                System.out.println("Error: Debes introducir un número entero válido para N.");
            }
        } else {
            System.out.println("Error: Debes introducir un número entero válido para M.");
        }
        scanner.close();
    }
}
