import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bombs = new int[n];
        for (int i = 0; i < n; i++) {
            bombs[i] = sc.nextInt();
        }
        
        int max = -1;
        for(int i = 0; i < n; i++){
            int left = Math.max(0, i - k);
            int right = Math.min(n, i + k);
            for(int j = left; j < right; j++){
                if(i == j) continue;
                
                if(bombs[i] == bombs[j])
                    max = Math.max(max, bombs[j]);
                
            }
        }
        System.out.print(max);
    }
}