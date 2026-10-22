import java.util.Scanner;
public class QPracticaExtra3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Día: ");
        int dia = scanner.nextInt();        
        System.out.print("Mes: ");
        int mes = scanner.nextInt();
        String signo = "Error: Fecha no válida";
        switch (mes) {
            case 1 -> signo = (dia >= 20) ? "Acuario" : "Capricornio";
            case 2 -> signo = (dia >= 19) ? "Piscis" : "Acuario";
            case 3 -> signo = (dia >= 21) ? "Aries" : "Piscis";
            case 4 -> signo = (dia >= 20) ? "Tauro" : "Aries";
            case 5 -> signo = (dia >= 21) ? "Géminis" : "Tauro";
            case 6 -> signo = (dia >= 21) ? "Cáncer" : "Géminis";
            case 7 -> signo = (dia >= 23) ? "Leo" : "Cáncer";
            case 8 -> signo = (dia >= 23) ? "Virgo" : "Leo";
            case 9 -> signo = (dia >= 23) ? "Libra" : "Virgo";
            case 10 -> signo = (dia >= 23) ? "Escorpio" : "Libra";
            case 11 -> signo = (dia >= 22) ? "Sagitario" : "Escorpio";
            case 12 -> signo = (dia >= 22) ? "Capricornio" : "Sagitario";
        }
        System.out.println("Horóscopo: " + signo);
        scanner.close();
    }
}
