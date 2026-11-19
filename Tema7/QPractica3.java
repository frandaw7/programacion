public class QPractica3 {
    public static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 2;
        }
    }
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] pares = new int[50];
        rellenarArray(pares);
        mostrarArray(pares);
    }
}
