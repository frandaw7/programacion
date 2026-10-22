import java.util.Scanner;
public class QPracticaExtra4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número: ");
        int n = scanner.nextInt();
        boolean capicua = false;
        if (n < 10) {
            capicua = true;
        } else if (n < 100) {
            capicua = (n % 10 == n / 10);
        } else if (n < 1000) {
            capicua = (n % 10 == n / 100);
        } else if (n < 10000) {
            capicua = (n % 10 == n / 1000) && ((n / 10) % 10 == (n / 100) % 10);
        } else if (n < 100000) {
            capicua = (n % 10 == n / 10000) && ((n / 10) % 10 == (n / 1000) % 10);
        }
        if (capicua) {
            System.out.println("Capicúa"); 
        } else {
            System.out.println("No capicúa"); 
        }
        scanner.close();
    }
}
