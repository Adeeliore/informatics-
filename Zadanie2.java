import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double k = scanner.nextDouble();
        Double m = scanner.nextDouble();
        while (k < m) {
            k += 1;
            if ((k % 3) == 0) {
                System.out.println(k);
            }
        }

    }
}
