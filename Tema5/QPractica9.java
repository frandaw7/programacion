import java.util.Scanner;
public class QPractica9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir número entero: ");
        int numero = scanner.nextInt();
        for (int i = 2; i <= numero; i += 2) {
            System.out.println(i);
        }
        scanner.close();
    }
}
