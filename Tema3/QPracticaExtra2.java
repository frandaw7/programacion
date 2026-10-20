import java.util.Scanner;
public class QPracticaExtra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir hora. / 0-23: ");
        int hora = scanner.nextInt();
        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else if ((hora >= 21 && hora <= 23) || (hora >= 0 && hora <= 5)) {
            System.out.println("Buenas noches");
        } else {
            System.out.println("Error: Hora no correcta. Rango: 0-23.");
        }
        scanner.close();
    }
}
