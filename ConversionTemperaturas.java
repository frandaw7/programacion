import java.util.Scanner;
public class ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0.0;
        double farenheit = 0.0;
        celsius = (5.0/9) * (farenheit - 32);
        farenheit = scanner.nextDouble();
        System.out.println("El resultado de esta operación es la conversión de un grado Farenheit a Celsius.");
        System.out.println("En la siguiente línea se halla la correspondiente resolución.");
        System.out.println(farenheit "ºF convertido a Celsius son" clesius "ºC");
    }
}
