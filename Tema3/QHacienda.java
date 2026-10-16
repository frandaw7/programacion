import java.util.Scanner;
public class QHacienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir estado (1=Soltero con hijos, 2=Casado con hijos, 3=Casado, 4=Soltero): ");
        int estadoc = scanner.nextInt();
        System.out.print("Introducir renta anual bruta: ");
        double rentaanualbruta = scanner.nextDouble();
        double porcentaje = 0.0;
        if (estadoc == 1) {
            if (rentaanualbruta >= 0 && rentaanualbruta <= 5000) {
                porcentaje = 0.04;
            } else if (rentaanualbruta >= 5001 && rentaanualbruta <= 8000) {
                porcentaje = 0.08;
            } else if (rentaanualbruta >= 8001 && rentaanualbruta <= 12000) {
                porcentaje = 0.12;
            } else if (rentaanualbruta >= 12001 && rentaanualbruta <= 20000) {
                porcentaje = 0.18;
            } else if (rentaanualbruta >= 20001 && rentaanualbruta <= 30000) {
                porcentaje = 0.25;
            } else if (rentaanualbruta > 30001) {
                porcentaje = 0.35;
            }
        } else if (estadoc == 2) {
            if (rentaanualbruta >= 0 && rentaanualbruta <= 6000) {
                porcentaje = 0.04;
            } else if (rentaanualbruta >= 6001 && rentaanualbruta <= 10000) {
                porcentaje = 0.08;
            } else if (rentaanualbruta >= 10001 && rentaanualbruta <= 15000) {
                porcentaje = 0.12;
            } else if (rentaanualbruta >= 15001 && rentaanualbruta <= 28000) {
                porcentaje = 0.18;
            } else if (rentaanualbruta >= 28001 && rentaanualbruta <= 35000) {
                porcentaje = 0.25;
            } else if (rentaanualbruta > 35001) {
                porcentaje = 0.35;
            }
        } else if (estadoc == 3) {
            if (rentaanualbruta >= 0 && rentaanualbruta <= 4000) {
                porcentaje = 0.04;
            } else if (rentaanualbruta >= 4001 && rentaanualbruta <= 7000) {
                porcentaje = 0.08;
            } else if (rentaanualbruta >= 7001 && rentaanualbruta <= 12000) {
                porcentaje = 0.12;
            } else if (rentaanualbruta >= 12001 && rentaanualbruta <= 20000) {
                porcentaje = 0.18;
            } else if (rentaanualbruta >= 20001 && rentaanualbruta <= 30000) {
                porcentaje = 0.25;
            } else if (rentaanualbruta > 30001) {
                porcentaje = 0.35;
            }
        } else if (estadoc == 4) {
            if (rentaanualbruta >= 0 && rentaanualbruta <= 3000) {
                porcentaje = 0.04;
            } else if (rentaanualbruta >= 3001 && rentaanualbruta <= 6000) {
                porcentaje = 0.08;
            } else if (rentaanualbruta >= 10001 && rentaanualbruta <= 15000) {
                porcentaje = 0.12;
            } else if (rentaanualbruta >= 15001 && rentaanualbruta <= 25000) {
                porcentaje = 0.18;
            } else if (rentaanualbruta >= 25001 && rentaanualbruta <= 35000) {
                porcentaje = 0.25;
            } else if (rentaanualbruta > 35001) {
                porcentaje = 0.35;
            }
        }
        double impuesto = rentaanualbruta * porcentaje;
        System.out.println("Porcentaje aplicado: " + (porcentaje * 100) + "%");
        System.out.println("Impuesto a pagar: " + impuesto + "€");
        scanner.close();
    }
}
