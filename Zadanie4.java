import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int d = 2 * r;
        scanner.close();

        for (int i = 1; i < d; i++) {
            for (double j = 1; j < d; j += 0.45) {

                if (((r - j) * (r - j) + (r - i) * (r - i)) < (r * r)) {
                    System.out.print("*");
                }

                else {
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
    }
}
