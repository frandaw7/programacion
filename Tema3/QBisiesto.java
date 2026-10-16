import java.util.Scanner;
public class QBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir año: ");
        int año = scanner.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("Bisiesto.");
        } else {
            System.out.println("No bisiesto.");
        }
        scanner.close();
    }
}
