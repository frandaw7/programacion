import java.util.Scanner;
public class QResta {
    public static void main(String[] args) {
        int numero1 = (int)(Math.random() * 10);
        int numero2 = (int)(Math.random() * 10);
        if (numero1 < numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuánto restan " + numero1 + " - " + numero2 + "? ");
        int restaefectuada = scanner.nextInt();
        if (restaefectuada == (numero1 - numero2)) {
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }
        scanner.close();
    }
}
