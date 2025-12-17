import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        System.out.print(calc(n));
    }

    public static int calc(int n){
        if(n <= 2) return n;

        return calc(n - 2) + n;
    }

}