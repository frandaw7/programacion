import java.util.Scanner;
import java.util.Locale;
public class QPractica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Introducir radio base: ");
        double radio = scanner.nextDouble();
        System.out.print("Introducir altura cono: ");
        double altura = scanner.nextDouble();
        if (radio <= 0 || altura <= 0) {
            System.out.println("Error: Radio y altura deberían ser mayores que 0.");
        } else {
            double volumen = (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
            System.out.printf("Volumen cono: %.2f\n", volumen);
        }
        scanner.close();
    }
}
