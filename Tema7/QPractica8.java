public class QPractica8 {
    public static void rellenarPares(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 2;
        }
    }
    public static void mostrarSuma(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        System.out.println("La suma de los 100 primeros números pares es: " + suma);
    }
    public static void main(String[] args) {
        int[] pares = new int[100];
        rellenarPares(pares);
        mostrarSuma(pares);
    }
}
