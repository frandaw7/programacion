public class QPractica5 {
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void rellenarArray(int[] array) {
        int indice = 0;
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                array[indice] = i;
                indice++;
            }
        }
    }
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] primos = new int[25];
        rellenarArray(primos);
        mostrarArray(primos);
    }
}
