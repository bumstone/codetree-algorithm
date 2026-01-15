import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int ans = 0;
        int n = C / B;
        int m = C / A;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= m; j++){
                int sum = j * A + i * B;
                if(sum > C) break;
                ans = Math.max(ans, sum);
            }
        }

        System.out.print(ans);
    }
}