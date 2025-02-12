import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        System.out.print(countUntilOne(n));

    }

    public static int countUntilOne(int n){
        if(n == 1){
            return 0;
        }

        if(n%2==0){
            n /= 2;
        } else {
            n /= 3;
        }

        return countUntilOne(n) + 1;
    }
}