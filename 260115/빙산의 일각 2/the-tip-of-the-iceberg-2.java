import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 1; i < 1000; i++){
            int[] counting = new int[n];
            for(int j = 0; j < n; j++){
                if(h[j] > i) counting[j]++;
            }

            int cnt = 0;
            for(int j = 0; j < n; j++){
                if(counting[j] > 0){
                    if(j == n - 1 || counting[j + 1] == 0) cnt++;
                }
            }
            ans = Math.max(ans, cnt);
        }
        

        System.out.print(ans);
    }
}