public class QLineaCaracterAleatorio {
    public static void main(String[] args) {
        int eleccion = (int)(Math.random() * 4) + 1;
        char caracter = ' ';
        if (eleccion == 1) {
            caracter = '#';
        } else if (eleccion == 2) {
            caracter = '$';
        } else if (eleccion == 3) {
            caracter = '€';
        } else {
            caracter = '&';
        }
        System.out.print(caracter);
        System.out.print(caracter);
        System.out.print(caracter);
        System.out.print(caracter);
        System.out.println(caracter);
    }
}
