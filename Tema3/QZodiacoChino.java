import java.util.Scanner;
public class QZodiacoChino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir año: ");
        int año = scanner.nextInt();
        int sol = año % 12;
        switch (sol) {
            case 0:
                System.out.println("Animal " + año + " = monkey");
                break;
            case 1:
                System.out.println("Animal " + año + " = rooster");
                break;
            case 2:
                System.out.println("Animal " + año + " = dog");
                break;
            case 3:
                System.out.println("Animal " + año + " = pig");
                break;
            case 4:
                System.out.println("Animal " + año + " = rat");
                break;
            case 5:
                System.out.println("Animal " + año + " = ox");
                break;
            case 6:
                System.out.println("Animal " + año + " = tiger");
                break;
            case 7:
                System.out.println("Animal " + año + " = rabbit");
                break;
            case 8:
                System.out.println("Animal " + año + " = dragon");
                break;
            case 9:
                System.out.println("Animal " + año + " = snake");
                break;
            case 10:
                System.out.println("Animal " + año + " = horse");
                break;
            case 11:
                System.out.println("Animal " + año + " = sheep");
                break;
        }
        scanner.close();
    }
}
