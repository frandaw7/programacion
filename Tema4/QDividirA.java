import java.util.Scanner;
public class QDividirA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir una palabra: ");
        String cadenacar = scanner.next();
        int posicionaA = cadenacar.indexOf('a');
        if (posicionaA == -1) {
            posicionaA = cadenacar.indexOf('A');
        }
        String Izq = cadenacar.substring(0, posicionaA);
        String Der = cadenacar.substring(posicionaA);
        System.out.println("División 1: " + Izq);
        System.out.println("División 2: " + Der);
        scanner.close();
    }
}
