import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bombs = new int[n + 2*k];
        for (int i = k; i < n + k; i++)
            bombs[i] = sc.nextInt();
        
        int bombNum = 0;
        int max = 0;
        for(int i = k; i < n + k; i++){
            int start = i - k, end = i + k;
            int cnt = -1;
            for(int j = start; j <= end; j++){
                if(bombs[i] == bombs[j]){
                    cnt++;
                }
            }
            if(max < cnt){
                max = cnt;
                bombNum = bombs[i];
            }
            else if(max == cnt){
                bombNum = Math.max(bombNum, bombs[i]);
            }
        }

        System.out.print(bombNum);
    }
}