import java.util.Scanner;
public class QPractica4 {
    public static void calcVolumen(double r, double h) {
        double volumen = Math.PI * Math.pow(r, 2) * h;
        System.out.println("El volumen del cilindro es: " + volumen);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir el radio del cilindro: ");
        double radio = scanner.nextDouble();
        System.out.print("Introducir la altura del cilindro: ");
        double altura = scanner.nextDouble();
        calcVolumen(radio, altura);
        scanner.close();
    }
}
