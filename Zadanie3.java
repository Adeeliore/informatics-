import java.util.Scanner;
public class Zadanie3 {
    private static double max(double a, double b) {
        if (a > b) return a;
        return b;
    }
    private static double sqrt(double x) {
        var l = 0d;
        var r = max(1d, x);
        var m = (l + r) / 2;
        while (r - l > 0.0000001) {
            if (m * m > x) r = m;
            else l = m;
            m = (l + r) / 2;
        }
        return l;
    }
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        var x = scanner.nextDouble();

        System.out.println(sqrt(x));
    }
}