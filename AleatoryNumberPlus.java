import java.util.Scanner;
public class AleatoryNumPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = (int)(Math.random() * 10) + 1;
        int numero2 = (int)(Math.random() * 10) + 1;
        int resultadoCorrecto = numero1 + numero2;
        int respuestaUsuario = 0;
        System.out.println("¿Cuánto es " + numero1 + " + " + numero2 + "?");
        System.out.println("Introduzca su respuesta en la siguiente línea:");
        respuestaUsuario = scanner.nextInt();
        boolean esCorrecto = (respuestaUsuario == resultadoCorrecto);
        if (esCorrecto) {
            System.out.println("¡Excelente! Su respuesta es correcta.");
        } else {
            System.out.println("Respuesta incorrecta. El resultado real era: " + resultadoCorrecto);
        }
        
        scanner.close();
    }
}
