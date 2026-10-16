import java.util.Scanner;
public class QLoteria {
    public static void main(String[] args) {
        int nAleatorio = (int)(Math.random() * 90) + 10;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir número de 2 dígitos: ");
        int intentolot = scanner.nextInt();
        int Digito1aleatorio = nAleatorio / 10;
        int Digito2aleatorio = nAleatorio % 10;
        int Digito1intentolot = intentolot / 10;
        int Digito2intentolot = intentolot % 10;
        System.out.println("Número ganador: " + nAleatorio);
        if (intentolot == nAleatorio) {
            System.out.println("Orden correcto. Premio de 10.000€.");
        } else if (Digito1intentolot == Digito2aleatorio && Digito2intentolot == Digito1aleatorio) {
            System.out.println("Orden inverso. Premio de 3.000€.");
        } else if (Digito1intentolot == Digito1aleatorio || Digito1intentolot == Digito2aleatorio || Digito2intentolot == Digito1aleatorio || Digito2intentolot == Digito2aleatorio) {
            System.out.println("1 dígito correcto. Premio de 1.000€.");
        } else {
            System.out.println("No hay coincidencias.");
        }
        scanner.close();
    }
}
