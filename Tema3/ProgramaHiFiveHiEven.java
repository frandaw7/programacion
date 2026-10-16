import java.util.Scanner;
public class ProgramaHiFiveHiEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir número entero: ");
        int numero = scanner.nextInt();
        if (numero % 5 == 0) {
            System.out.println("HiFive");
        }
        if (numero % 2 == 0) {
            System.out.println("HiEven");
        }
        scanner.close();
    }
}
