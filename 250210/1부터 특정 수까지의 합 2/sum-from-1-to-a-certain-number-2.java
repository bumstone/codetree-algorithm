import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(totalSum(n));
    }

    public static int totalSum(int n){
        if(n == 1){
            return 1;
        }
        return totalSum(n - 1) + n;
    }
}