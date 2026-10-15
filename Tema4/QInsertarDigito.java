import java.util.Scanner;
public class QInsertarDigito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir un número: ");
        String numeroTexto = scanner.next();
        System.out.print("Introducir la posición donde quiere insertar el dígito: ");
        int posicion = scanner.nextInt();
        System.out.print("Introduzcir el dígito que quiere insertar: ");
        String digito = scanner.next();
        String parteIzquierda = numeroTexto.substring(0, posicion - 1);
        String parteDerecha = numeroTexto.substring(posicion - 1);
        String resultadoTexto = parteIzquierda + digito + parteDerecha;
        long numeroResultante = Long.parseLong(resultadoTexto);
        System.out.println("El número resultante es " + numeroResultante + ".");
        scanner.close();
    }
}
