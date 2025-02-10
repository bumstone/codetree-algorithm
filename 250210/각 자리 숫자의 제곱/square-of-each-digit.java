import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(squaredDigit(n));
    }

    public static int squaredDigit(int n){
        if(n < 10){
            return n * n;
        }
        return squaredDigit(n / 10) + (n % 10) * (n % 10);
    }
}