import java.util.Scanner;
public class QPractica9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        while (numero < 1) {
            System.out.print("Introducir número entero (mayor o igual a 1): ");
            numero = scanner.nextInt();            
            if (numero < 1) {
                System.out.println("Error: El número debe ser mayor o igual a 1.");
            }
        }
        for (int i = 2; i <= numero; i += 2) {
            System.out.println(i);
        }
        scanner.close();
    }
}
