public class QPalabraAleatoria {
    public static void main(String[] args) {
        System.out.println("La palabra aleatoria generada es la siguiente:");
        int n1 = (int)(Math.random() * 26);
        int n2 = (int)(Math.random() * 26);
        int n3 = (int)(Math.random() * 26);
        int n4 = (int)(Math.random() * 26);
        int n5 = (int)(Math.random() * 26);
        System.out.print((char)(n1 + 'A'));
        System.out.print((char)(n2 + 'A'));
        System.out.print((char)(n3 + 'A'));
        System.out.print((char)(n4 + 'A'));
        System.out.print((char)(n5 + 'A'));
        System.out.print(" - ");
        System.out.print((char)(n1 + 'a'));
        System.out.print((char)(n2 + 'a'));
        System.out.print((char)(n3 + 'a'));
        System.out.print((char)(n4 + 'a'));
        System.out.println((char)(n5 + 'a'));
    }
}
