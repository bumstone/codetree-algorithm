import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bombs = new int[n];    
        for (int i = 0; i < n; i++){
            bombs[i] = sc.nextInt();
        }

        int maxNum = 0;
        int maxCnt = 0;
        boolean[] check = new boolean[n];
        for(int i = 0; i <= 1000000; i++){
            int cnt = 1;
            for(int j = 0; j < n; j++){
                if(i != bombs[j]) continue;
                for(int len = j + 1; len < n && len <= j + k; len++){
                    if(!check[len] && i == bombs[len]){
                        check[len] = true;
                        cnt++;
                    }
                }
            }
            if(cnt == 1) continue;
            if(maxCnt <= cnt){
                maxCnt = cnt;
                maxNum = i;
            }
            check = new boolean[n];
        }

        System.out.print(maxNum);
    }
}
