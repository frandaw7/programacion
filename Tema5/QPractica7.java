public class QPractica7 {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i++) {
            boolean nprimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    nprimo = false;
                    break;
                }
            }
            if (nprimo) {
                System.out.println(i);
            }
        }
    }
}
