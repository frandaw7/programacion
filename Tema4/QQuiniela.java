public class QQuiniela {
    public static void main(String[] args) {
        System.out.println("Resultado de la quiniela: ");
        int dado1 = (int)(Math.random() * 6) + 1;
        if (dado1 <= 3) {
            System.out.println(1);
        } else if (dado1 <= 5) {
            System.out.println('X');
        } else {
            System.out.println(2);
        }
        int dado2 = (int)(Math.random() * 6) + 1;
        if (dado2 <= 3) {
            System.out.println(1);
        } else if (dado2 <= 5) {
            System.out.println('X');
        } else {
            System.out.println(2);
        }
        int dado3 = (int)(Math.random() * 6) + 1;
        if (dado3 <= 3) {
            System.out.println(1);
        } else if (dado3 <= 5) {
            System.out.println('X');
        } else {
            System.out.println(2);
        }
    }
}
