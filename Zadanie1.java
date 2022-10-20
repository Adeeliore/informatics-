public class Zadanie1 {
    public static void main(String[] args) {

        int n = 15;

        // рисуем верхний треугольник
        for (int i = 0; i < n; ++i) {
            // рисуем пробелы слева
            for (int l = 0; l < 2 * n - i; ++l) {
                System.out.print(" ");
            }

            // рисуем *
            for (int s = 0; s < 2 * i + 1; ++s) {
                System.out.print("*");
            }

            // рисуем пробелы cправа
            for (int r = 0; r < 2 * n - i; ++r) {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        // рисуем нижние 2 треугольника
        for (int i = 0; i < n; ++i) {
            // рисуем пробелы слева
            for (int l = 0; l < n - 1 - i; ++l) {
                System.out.print(" ");
            }

            // рисуем *
            for (int s = 0; s < 2 * i + 1; ++s) {
                System.out.print("*");
            }

            // рисуем центральные пробелы
            for (int c = 0; c < 2 * n - 2 * i + 1; ++c) {
                System.out.print(" ");
            }
            // рисуем *
            for (int s = 0; s < 2 * i + 1; ++s) {
                System.out.print("*");
            }

            // рисуем пробелы cправа
            for (int r = 0; r < n - 1 - i; ++r) {
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }

}


