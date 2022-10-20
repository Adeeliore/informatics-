import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double c = scanner.nextDouble();
        System.out.println(cor(a, b, c));
    }

    private static double cor(double a, double b, double c) {
        double d, x1, x2;
        d = (b * b) - 4 * a * c;
        if (d > 1) {
            x1 = ((-b) + Math.pow(d, 0.5)) / 2 * a;
            x2 = ((-b) - Math.pow(d, 0.5)) / 2 * a;
            System.out.println(x1 + "," + x2);
            System.out.println(a + " " + "x^2" + " " + b + " " + "x" + " " + c);
        } else if (d == 0) {
            x1 = (-b) / 2 * a;
            System.out.println(x1);
            System.out.println(a + "x^2" + b + "x" + c);
        } else if (d < 0) {
            System.out.println("Корней нет");
        }
        return 0;
    }
}

