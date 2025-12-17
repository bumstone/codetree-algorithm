import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.

        System.out.println(calc(a * b * c));
    }

    public static int calc(int n){
        if(n <= 0) return 0;

        return calc(n / 10) + n % 10;
    }
}