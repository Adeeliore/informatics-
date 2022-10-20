import java.util.Scanner;
public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr;// инициализация массива
        arr = new int[n]; //n - длина массива, создаем массив
        for (int i = 0; i < n; i++) {
            int m = i % 2 == 0 ? 1 : -1;
            arr[i] = (i * 2 + 1) * m;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
