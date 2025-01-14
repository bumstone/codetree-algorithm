import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(GCD(n, m));

    }

    public static int GCD(int n, int m){
        int result = 1;

        int k = n > m ? m : n;
        for(int i = 2; i <= k; i++){
            if(n % i == 0 && m % i == 0){
                n /= i;
                m /= i; 
                result *= i;
            }
        }

        return result;
    }
}