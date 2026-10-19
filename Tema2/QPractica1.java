import java.util.Scanner;
public class QPractica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir horas trabajadas esta semana: ");
        int horas = scanner.nextInt();
        int salarioTotal = horas * 12;
        System.out.println("Salario semanal correspondiente: " + salarioTotal + "€");
        scanner.close();
    }
}
