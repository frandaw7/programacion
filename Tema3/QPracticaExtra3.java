import java.util.Scanner;
public class QPracticaExtra3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(new char[]{'D', 'i', 'a', ':', ' '});
        int dia = scanner.nextInt();
        System.out.print(new char[]{'M', 'e', 's', ':', ' '});
        int mes = scanner.nextInt();
        System.out.print(new char[]{'H', 'o', 'r', 'o', 's', 'c', 'o', 'p', 'o', ':', ' '});        
        if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            System.out.println(new char[]{'C', 'a', 'p', 'r', 'i', 'c', 'o', 'r', 'n', 'i', 'o'});
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            System.out.println(new char[]{'A', 'c', 'u', 'a', 'r', 'i', 'o'});
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            System.out.println(new char[]{'P', 'i', 's', 'c', 'i', 's'});
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            System.out.println(new char[]{'A', 'r', 'i', 'e', 's'});
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            System.out.println(new char[]{'T', 'a', 'u', 'r', 'o'});
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            System.out.println(new char[]{'G', 'e', 'm', 'i', 'n', 'i', 's'});
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            System.out.println(new char[]{'C', 'a', 'n', 'c', 'e', 'r'});
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            System.out.println(new char[]{'L', 'e', 'o'});
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            System.out.println(new char[]{'V', 'i', 'r', 'g', 'o'});
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            System.out.println(new char[]{'L', 'i', 'b', 'r', 'a'});
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            System.out.println(new char[]{'E', 's', 'c', 'o', 'r', 'p', 'i', 'o'});
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            System.out.println(new char[]{'S', 'a', 'g', 'i', 't', 'a', 'r', 'i', 'o'});
        } else {
            System.out.println(new char[]{'E', 'r', 'r', 'o', 'r'});
        }
        scanner.close();
    }
}
