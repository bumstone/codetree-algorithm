import java.util.Scanner;

public class Main {

    public static int[] A;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        A = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(rangeSum(a, b));
        }
    }

    public static int rangeSum(int a, int b){
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum += A[i];
        }

        return sum;
    }
}