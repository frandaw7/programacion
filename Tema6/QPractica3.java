import java.util.Scanner;
public class QPractica3 {
    public static double conMax(double n1, double n2, double n3) {
        if (n1 >= n2 && n1 >= n3) {
            return n1;
        } else if (n2 >= n1 && n2 >= n3) {
            return n2;
        } else {
            return n3;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir número 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introducir número 2: ");
        double num2 = scanner.nextDouble();
        System.out.print("Introducir número 3: ");
        double num3 = scanner.nextDouble();
        double max = conMax(num1, num2, num3);
        System.out.println("Número máximo entre " + num1 + ", " + num2 + " y " + num3 + " = " + max);
        scanner.close();
    }
}
