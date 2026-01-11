import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int ans = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == j) continue;
                boolean check = true;
                for(int x = 0; x < k; x++){
                    int idx1 = 0, idx2 = 0;
                    for(int y = 0; y < n; y++){
                        if(arr[x][y] == i)
                            idx1 = y;
                        if(arr[x][y] == j)
                            idx2 = y;
                    }
                    if(idx1 > idx2) check = false;
                }
                if(check) ans++;
            }
        }
        System.out.print(ans);
    }
}