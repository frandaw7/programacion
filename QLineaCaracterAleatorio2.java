public class QLineaCaracterAleatorio2 {
    public static void main(String[] args) {
        int eleccion = (int)(Math.random() * 6) + 1;
        char caracter = ' ';
        if (eleccion == 1) {
            caracter = '*';
        } else if (eleccion == 2) {
            caracter = '-';
        } else if (eleccion == 3) {
            caracter = '=';
        } else if (eleccion == 4) {
            caracter = '.';
        } else if (eleccion == 5) {
            caracter = '|';
        } else {
            caracter = '@';
        }
        System.out.print(caracter);
        System.out.print(caracter);
        System.out.print(caracter);
        System.out.print(caracter);
        System.out.println(caracter);
    }
}
