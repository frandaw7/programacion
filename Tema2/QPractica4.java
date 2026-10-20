import java.util.Scanner;
public class QPractica4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir cantidad en Kb: ");
        double kb = scanner.nextDouble();
        double mb = kb / 1024.0;
        System.out.printf("%.2f Kb equivalen a %.2f Mb\n", kb, mb);
        scanner.close();
    }
}
