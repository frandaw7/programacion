import java.util.Scanner;
public class QPractica6 {
    public static int sumaDivisores(int num) {
        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
    public static boolean sonAmigos(int a, int b) {
        return sumaDivisores(a) == sumaDivisores(b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir el primer número entero positivo: ");
        int num1 = scanner.nextInt();
        System.out.print("Introducir el segundo número entero positivo: ");
        int num2 = scanner.nextInt();
        if (sonAmigos(num1, num2)) {
            System.out.println("Los números " + num1 + " y " + num2 + " son amigos.");
        } else {
            System.out.println("Los números " + num1 + " y " + num2 + " no son amigos.");
        }
        scanner.close();
    }
}
