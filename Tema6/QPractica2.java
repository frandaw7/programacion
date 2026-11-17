import java.util.Scanner;
public class QPractica2 {
    public static double conMax(double n1, double n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir número 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introducir número 2: ");
        double num2 = scanner.nextDouble();
        double max = conMax(num1, num2);
        System.out.println("Número máximo entre " + num1 + " y " + num2 + " = " + max);
        scanner.close();
    }
}
