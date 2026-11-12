import java.util.Scanner;
public class QPractica1 {
    public static boolean esCapicua(long x) {
        if (x < 0) {
            return false;
        }
        return x == voltea(x);
    }
    public static long potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        long resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    public static int digitos(long x) {
        if (x < 0) {
            x = -x;
        }
        if (x == 0) {
            return 1;
        }
        int contador = 0;
        while (x > 0) {
            x /= 10;
            contador++;
        }
        return contador;
    }
    public static long voltea(long x) {
        if (x < 0) {
            return -voltea(-x);
        }
        long volteado = 0;
        while (x > 0) {
            volteado = (volteado * 10) + (x % 10);
            x /= 10;
        }
        return volteado;
    }
    public static long quitaPorDetras(long x, int n) {
        return x / potencia(10, n);
    }
    public static long pegaPorDelante(long x, int d) {
        boolean esNegativo = x < 0;
        if (esNegativo) {
            x = -x;
        }
        long resultado = (d * potencia(10, digitos(x))) + x;
        if (esNegativo) {
            return -resultado;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n--- BIBLIOTECA DE FUNCIONES MATEMÁTICAS ---");
            System.out.println("1. Comprobar si es capicúa");
            System.out.println("2. Calcular potencia");
            System.out.println("3. Contar dígitos");
            System.out.println("4. Voltear número");
            System.out.println("5. Quitar dígitos por detrás");
            System.out.println("6. Pegar dígito por delante");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion == 1) {
                    System.out.print("Introduce un número entero: ");
                    if (scanner.hasNextLong()) {
                        long num = scanner.nextLong();
                        if (esCapicua(num)) {
                            System.out.println("El número " + num + " SÍ es capicúa.");
                        } else {
                            System.out.println("El número " + num + " NO es capicúa.");
                        }
                    } else {
                        System.out.println("Error: Debes introducir un número entero válido.");
                        scanner.next();
                    }
                } else if (opcion == 2) {
                    System.out.print("Introduce la base (entero): ");
                    if (scanner.hasNextInt()) {
                        int base = scanner.nextInt();
                        System.out.print("Introduce el exponente (entero >= 0): ");
                        if (scanner.hasNextInt()) {
                            int exp = scanner.nextInt();
                            if (exp >= 0) {
                                System.out.println("Resultado: " + potencia(base, exp));
                            } else {
                                System.out.println("Error: El exponente no puede ser negativo.");
                            }
                        } else {
                            System.out.println("Error: Debes introducir un exponente entero válido.");
                            scanner.next();
                        }
                    } else {
                        System.out.println("Error: Debes introducir una base entera válida.");
                        scanner.next();
                    }
                } else if (opcion == 3) {
                    System.out.print("Introduce un número entero: ");
                    if (scanner.hasNextLong()) {
                        long num = scanner.nextLong();
                        System.out.println("Cantidad de dígitos: " + digitos(num));
                    } else {
                        System.out.println("Error: Debes introducir un número entero válido.");
                        scanner.next();
                    }
                } else if (opcion == 4) {
                    System.out.print("Introduce un número entero: ");
                    if (scanner.hasNextLong()) {
                        long num = scanner.nextLong();
                        System.out.println("Número volteado: " + voltea(num));
                    } else {
                        System.out.println("Error: Debes introducir un número entero válido.");
                        scanner.next();
                    }
                } else if (opcion == 5) {
                    System.out.print("Introduce un número entero: ");
                    if (scanner.hasNextLong()) {
                        long num = scanner.nextLong();
                        System.out.print("¿Cuántos dígitos quieres quitar por detrás?: ");
                        if (scanner.hasNextInt()) {
                            int n = scanner.nextInt();
                            if (n >= 0) {
                                System.out.println("Resultado: " + quitaPorDetras(num, n));
                            } else {
                                System.out.println("Error: La cantidad de dígitos a quitar debe ser mayor o igual a 0.");
                            }
                        } else {
                            System.out.println("Error: Debes introducir un número entero válido.");
                            scanner.next();
                        }
                    } else {
                        System.out.println("Error: Debes introducir un número entero válido.");
                        scanner.next();
                    }
                } else if (opcion == 6) {
                    System.out.print("Introduce un número entero: ");
                    if (scanner.hasNextLong()) {
                        long num = scanner.nextLong();
                        System.out.print("Introduce el dígito a pegar por delante (0-9): ");
                        if (scanner.hasNextInt()) {
                            int digito = scanner.nextInt();
                            if (digito >= 0 && digito <= 9) {
                                System.out.println("Resultado: " + pegaPorDelante(num, digito));
                            } else {
                                System.out.println("Error: Debes introducir un único dígito entre 0 y 9.");
                            }
                        } else {
                            System.out.println("Error: Debes introducir un dígito válido.");
                            scanner.next();
                        }
                    } else {
                        System.out.println("Error: Debes introducir un número entero válido.");
                        scanner.next();
                    }
                } else if (opcion == 0) {
                    System.out.println("Programa finalizado.");
                } else {
                    System.out.println("Error: Opción no válida. Elige entre 0 y 6.");
                }
            } else {
                System.out.println("Error: Debes introducir un número de opción válido.");
                scanner.next();
            }
        }
        scanner.close();
    }
}
