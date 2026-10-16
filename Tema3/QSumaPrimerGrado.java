import java.util.Scanner;
public class QSumaPrimerGrado {
    public static void main(String[] args) {
        int numero1 = (int)(Math.random() * 10);
        int numero2 = (int)(Math.random() * 10);
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuánto suman " + numero1 + " + " + numero2 + "? ");
        int sumaefectuada = scanner.nextInt();
        if (sumaefectuada == (numero1 + numero2)) {
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }
        scanner.close();
    }
}
