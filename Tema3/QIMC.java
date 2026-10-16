import java.util.Scanner;
public class QIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir peso en kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Introducir altura en metros: ");
        double altura = scanner.nextDouble();
        double calculoimc = peso / (altura * altura);
        System.out.print("Según IMC / Interpretación: ");
        if (calculoimc < 18.5) {
            System.out.println("Bajo de peso");
        } else if (calculoimc >= 18.5 && calculoimc < 25.0) {
            System.out.println("Normal");
        } else if (calculoimc >= 25.0 && calculoimc < 30.0) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obeso");
        }
        scanner.close();
    }
}
