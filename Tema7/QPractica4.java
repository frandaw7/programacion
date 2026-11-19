public class QPractica4 {
    public static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (i * 2) + 1;
        }
    }
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] impares = new int[50];
        rellenarArray(impares);
        mostrarArray(impares);
    }
}
