public class QBarajaFrancesa {
    public static void main(String[] args) {
        int numCarta = (int)(Math.random() * 13) + 1;
        int numPalo = (int)(Math.random() * 4) + 1;
        System.out.print("Tu carta aleatoria es: ");
        if (numCarta == 1) {
            System.out.print("A");
        } else if (numCarta == 11) {
            System.out.print("J");
        } else if (numCarta == 12) {
            System.out.print("Q");
        } else if (numCarta == 13) {
            System.out.print("K");
        } else {
            System.out.print(numCarta);
        }
        System.out.print(" de ");
        if (numPalo == 1) {
            System.out.println("Picas");
        } else if (numPalo == 2) {
            System.out.println("Corazones");
        } else if (numPalo == 3) {
            System.out.println("Diamantes");
        } else {
            System.out.println("Tréboles");
        }
    }
}
