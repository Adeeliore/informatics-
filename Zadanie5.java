import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //создаем ячейку памяти
        Double x = scanner.nextDouble(); //принимает х с консоли
        double faс = 1;
        double k = 1;
        double m = 1;
        double sin = x;
        for (int i = 1; Math.abs(m) > 1e-9; ++i) {
            faс = faс * i;
            if (i % 2 != 0) {
                if (i != 1) {
                    k += 1; // для sign
                    double sign = k % 2 == 0 ? -1 : 1;
                    double stepa = Math.pow(x, i);
                    m = sign * (stepa / faс);   //дробь
                    sin = sin + m;   //синус
                }
            }
        }
        System.out.println(sin);
    }
}
