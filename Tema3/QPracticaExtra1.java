import java.util.Scanner;
public class QPracticaExtra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lunes");
        System.out.println("Martes");
        System.out.println("Miércoles");
        System.out.println("Jueves");
        System.out.println("Viernes");
        System.out.print("Introducir número día de la semana. / 1-5: ");
        int dia = scanner.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes - Programación.");
                break;
            case 2:
                System.out.println("Martes - Lenguaje de marca.");
                break;
            case 3:
                System.out.println("Miércoles - Bases de datos.");
                break;
            case 4:
                System.out.println("Jueves - Sistemas informáticos.");
                break;
            case 5:
                System.out.println("Viernes - Digitalización.");
                break;
            default:
                System.out.println("Error: Día no perteneciente a rango 1-5.");
                break;
        }
        scanner.close();
    }
}
