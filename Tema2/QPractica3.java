import java.util.Scanner;
public class QPractica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir cantidad en Mb: ");
        double mb = scanner.nextDouble();
        double kb = mb * 1024;
        
        System.out.printf("%.2f Mb equivalen a %.2f Kb\n", mb, kb);
        
        scanner.close();
    }
}
