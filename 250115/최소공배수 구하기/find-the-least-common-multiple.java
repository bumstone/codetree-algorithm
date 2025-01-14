import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.print(LCM(n,m));

    }

    public static int LCM(int n, int m){
        int result = 1;
        for(int i = 2; i <= Math.max(n, m); i++){
            if(n % i == 0 || m % i == 0) {
                if(n % i == 0) n /= i;
                if(m % i == 0) m /= i;
                result *= i;
                i--;
            }
        }

        return result;
    }
}