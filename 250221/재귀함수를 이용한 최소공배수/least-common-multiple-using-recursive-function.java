import java.util.Scanner;

public class Main {
    static int[] arr = new int[10];

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print(arrLcm(n));
    }

    public static int arrLcm(int n){
        int a = arr[0];
        for(int i = 1; i < n; i++){
            a = lcm(a, arr[i]);
        }

        return a;
    }

    public static int lcm(int a, int b){
        if(a % b == 0){
            return a;
        }

        return a * b / gcd(b, a % b);
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}