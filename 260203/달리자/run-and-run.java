import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int len = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > b[i]) {
                int remain = a[i] - b[i];
                len += remain;
                a[i + 1] += remain;
            }
        }
        System.out.print(len);
    }
}