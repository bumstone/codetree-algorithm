import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int n = (int) Math.sqrt(x);

        if (x == n * n) {
            System.out.print(2 * n - 1);
        } else if (x <= n * n + n) {
            System.out.print(2 * n);
        } else {
            System.out.print(2 * n + 1);
        }
    }
}