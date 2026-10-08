import java.util.Scanner;
public class CalcularSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salarioSemanal = 0.0;
        float salarioHora = 12.0;
        float numeroHoras = 0.0;
        numeroHoras = scanner.nextfloat();
        salarioSemanal = salarioHora * numeroHoras;
        System.out.printIn("Introduza el número de horas trabajadas.");
        System.out.printIn("En la siguiente línea se halla la correspondiente resolución.");
        System.out.printIn(salarioSemanal);
    }
}
