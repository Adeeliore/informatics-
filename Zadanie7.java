import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int n = scanner.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.println("Введите элемент массива:");
            int x = scanner.nextInt();
            //System.out.println(arr);
            arr[i] = x;
        }
        for (int i = 0; i < n; ++i) {
            int m = 0;
            int el = arr[i];
            int t = 0;
            boolean j = false;
            while (el > 0) {
                m = el % 10;
                //System.out.println("остаток" + " " + m);
                el = el / 10;
                //System.out.println("ост часть числа" + " " + el);
                if (m >= t) {
                    //System.out.println("shit" + " " + true);
                    j = true;
                    t = m;
                } else {
                    j = false;
                }
            }
            if (j == true) {
                System.out.println("В числе = " + "" + arr[i] + " " + "цифры идут по убыванию");
            }
        }
    }
}
