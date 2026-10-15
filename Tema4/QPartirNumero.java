import java.util.Scanner;
public class QPartirNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir un número: ");
        String numeroTexto = scanner.next();
        System.out.print("Introducir la posición a partir de la cual quiere partir el número: ");
        int posicion = scanner.nextInt();
        String Izq = numeroTexto.substring(0, posicion - 1);
        String Der = numeroTexto.substring(posicion - 1);
        System.out.println("Los números partidos son el " + Izq + " y el " + Der);
        scanner.close();
    }
}
