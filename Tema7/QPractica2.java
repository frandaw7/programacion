public class QPractica2 {
    public static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 100 - i;
        }
    }
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] numeros = new int[100];
        rellenarArray(numeros);
        mostrarArray(numeros);
    }
}
