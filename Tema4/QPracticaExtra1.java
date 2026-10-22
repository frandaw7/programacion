import java.util.Scanner;
public class QPracticaExtra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double n1 = scanner.nextDouble();
        System.out.println("Alza: " + Math.ceil(n1) + " | Baja: " + Math.floor(n1) + " | Truncada: " + (int)n1);
        System.out.print("Nota 2: ");
        double n2 = scanner.nextDouble();
        System.out.println("Alza: " + Math.ceil(n2) + " | Baja: " + Math.floor(n2) + " | Truncada: " + (int)n2);
        System.out.print("Nota 3: ");
        double n3 = scanner.nextDouble();
        System.out.println("Alza: " + Math.ceil(n3) + " | Baja: " + Math.floor(n3) + " | Truncada: " + (int)n3);
        System.out.print("Nota 4: ");
        double n4 = scanner.nextDouble();
        System.out.println("Alza: " + Math.ceil(n4) + " | Baja: " + Math.floor(n4) + " | Truncada: " + (int)n4);
        System.out.print("Nota 5: ");
        double n5 = scanner.nextDouble();
        System.out.println("Alza: " + Math.ceil(n5) + " | Baja: " + Math.floor(n5) + " | Truncada: " + (int)n5);
        double media = (n1 + n2 + n3 + n4 + n5) / 5;        
        double max = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));
        double min = Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4, n5))));
        System.out.println("Resultados: ");
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        scanner.close();
    }
}
