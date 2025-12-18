import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        System.out.println(calc(n));
    }

    public static int calc(int n ){
        if (n == 1) return 0;

        if(n % 2 == 1){
            n = n * 3 + 1;
        } else {
            n = n / 2;
        }

        return calc(n) + 1;
    }
}