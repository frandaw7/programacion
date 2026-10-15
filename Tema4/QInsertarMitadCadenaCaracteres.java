import java.util.Scanner;
public class QInsertarMitadCadenaCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir cadena de caracteres: ");
        String cadenacar = scanner.nextLine();
        int mitad = cadenacar.length() / 2;
        String Izq = cadenacar.substring(0, mitad);
        String Der = cadenacar.substring(mitad);
        String resultado = Izq + "<>" + Der;
        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
}
