import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(sieveOfEratosthenes(a, b));
    }

    public static int sieveOfEratosthenes(int a, int b) {
        boolean[] isPrime = new boolean[b + 1];
        int sumPrime = 0;
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        for(int i = 2; i * i <= b; i++) {
            if(isPrime[i]) {
                for(int j = i * i; j <= b; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for(int i = a; i <= b; i++) {
            if(isPrime[i]) {
                sumPrime += i;
            }
        }
        
        return sumPrime;
    }
}