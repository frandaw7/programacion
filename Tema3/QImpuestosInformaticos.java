import java.util.Scanner;
public class QImpuestosInformaticos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu estado civil (0=Soltero, 1=Casado conjunto, 2=Casado separado, 3=Cabeza familia): ");
        int status = scanner.nextInt();
        System.out.print("Introducir ingresos imponibles: ");
        double ingresos = scanner.nextDouble();
        double tasa = 0.0;
        if (status == 0) {
            if (ingresos <= 8350) {
                tasa = 0.10;
            } else if (ingresos <= 33950) {
                tasa = 0.15;
            } else if (ingresos <= 82250) {
                tasa = 0.25;
            } else if (ingresos <= 171550) {
                tasa = 0.28;
            } else if (ingresos <= 372950) {
                tasa = 0.33;
            } else {
                tasa = 0.35;
            }
            System.out.println("Impuesto federal estimado: " + (ingresos * tasa));
        } else if (status == 1) {
            if (ingresos <= 16700) {
                tasa = 0.10;
            } else if (ingresos <= 67900) {
                tasa = 0.15;
            } else if (ingresos <= 137050) {
                tasa = 0.25;
            } else if (ingresos <= 208850) {
                tasa = 0.28;
            } else if (ingresos <= 372950) {
                tasa = 0.33;
            } else {
                tasa = 0.35;
            }
            System.out.println("Impuesto federal estimado: " + (ingresos * tasa));
        } else if (status == 2) {
            if (ingresos <= 8350) {
                tasa = 0.10;
            } else if (ingresos <= 33950) {
                tasa = 0.15;
            } else if (ingresos <= 68525) {
                tasa = 0.25;
            } else if (ingresos <= 104425) {
                tasa = 0.28;
            } else if (ingresos <= 186475) {
                tasa = 0.33;
            } else {
                tasa = 0.35;
            }
            System.out.println("Impuesto federal estimado: " + (ingresos * tasa));
        } else if (status == 3) {
            if (ingresos <= 11950) {
                tasa = 0.10;
            } else if (ingresos <= 45500) {
                tasa = 0.15;
            } else if (ingresos <= 117450) {
                tasa = 0.25;
            } else if (ingresos <= 190200) {
                tasa = 0.28;
            } else if (ingresos <= 372950) {
                tasa = 0.33;
            } else {
                tasa = 0.35;
            }
            System.out.println("Impuesto federal estimado: " + (ingresos * tasa));
        } else {
            System.out.println("Error: Estado civil incorrecto.");
        }
        scanner.close();
    }
}
