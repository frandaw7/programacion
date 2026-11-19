import java.util.Scanner;
public class QPractica7 {
    static Scanner scanner = new Scanner(System.in);
    public static int LeeAñoValido() {
        int a;
        do {
            System.out.print("Introducir un año válido (desde 1583): ");
            a = scanner.nextInt();
        } while (a < 1583);
        return a;
    }
    public static int LeeMesValido(int a) {
        int m;
        do {
            System.out.print("Introducir un mes válido (1-12): ");
            m = scanner.nextInt();
        } while (m < 1 || m > 12);
        return m;
    }
    public static int LeeDiaValido(int a, int m) {
        int maxDias = 31;
        if (m == 2) {
            if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
                maxDias = 29;
            } else {
                maxDias = 28;
            }
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            maxDias = 30;
        }
        int d;
        do {
            System.out.print("Introducir un día válido (1-" + maxDias + "): ");
            d = scanner.nextInt();
        } while (d < 1 || d > maxDias);
        return d;
    }
    public static int DiaSemana(int d, int m, int a) {
        int varA, varB, varC;
        if (m == 1 || m == 2) {
            varA = m + 10;
            varB = (a - 1) % 100;
            varC = (a - 1) / 100;
        } else {
            varA = m - 2;
            varB = a % 100;
            varC = a / 100;
        }
        int n = (700 + (26 * varA - 2) / 10 + d + varB + varB / 4 + varC / 4 - 2 * varC) % 7;
        if (n == 0) {
            return 7;
        }
        return n;
    }
    public static String DiaEnLetra(int nDia) {
        switch (nDia) {
            case 1: return "Lunes";
            case 2: return "Martes";
            case 3: return "Miércoles";
            case 4: return "Jueves";
            case 5: return "Viernes";
            case 6: return "Sábado";
            case 7: return "Domingo";
            default: return "";
        }
    }
    public static void main(String[] args) {
        int año = LeeAñoValido();
        int mes = LeeMesValido(año);
        int dia = LeeDiaValido(año, mes);
        int nDia = DiaSemana(dia, mes, año);
        System.out.println("El día de la semana correspondiente es: " + DiaEnLetra(nDia));
        scanner.close();
    }
}
