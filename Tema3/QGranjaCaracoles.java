import java.util.Scanner;
public class QGranjaCaracoles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir KGs de caracoles: ");
        double kgs = scanner.nextDouble();
        System.out.print("Introducir comprador (1 = Empresa, 2 = Particular): ");
        int comprador = scanner.nextInt();
        double precioNoDescuento = kgs * 3.5;
        double descuento = 0.0;
        if (comprador == 1) {
            if (kgs > 100) {
                descuento = 0.40;
            } else if (kgs > 50) {
                descuento = 0.25;
            } else if (kgs > 25) {
                descuento = 0.15;
            } else if (kgs > 10) {
                descuento = 0.10;
            }
        } else if (comprador == 2) {
            if (kgs > 120) {
                descuento = 0.40;
            } else if (kgs > 60) {
                descuento = 0.25;
            } else if (kgs > 30) {
                descuento = 0.15;
            } else if (kgs > 12) {
                descuento = 0.10;
            }
        }
        double precioSiDescuento = precioNoDescuento * (1 - descuento);
        double iva = precioSiDescuento * 0.21;
        double precioDefinitivo = precioSiDescuento + iva;
        System.out.println("Precio sin descuento: " + precioNoDescuento + "€");
        System.out.println("Precio con descuento: " + precioSiDescuento + "€");
        System.out.println("IVA (21%): " + iva + "€");
        System.out.println("Precio definitivo: " + precioDefinitivo + "€");
        scanner.close();
    }
}
