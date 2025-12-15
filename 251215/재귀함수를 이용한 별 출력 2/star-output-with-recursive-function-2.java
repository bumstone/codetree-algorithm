import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        star2(n);
    }

    public static void star2(int N){
        if(N < 1) return;

        for(int i = 0; i < N; i++){
            System.out.print("* ");
        }
        System.out.println();
        star2(N - 1);
        for(int i = N; i > 0; i--){
            System.out.print("* ");
        }
        System.out.println();

    }
}