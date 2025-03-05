import java.util.Scanner;
public class Main {
    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int cnt = 0, result = 0;
        int[] dx = new int[]{0, 1,  0, -1};
        int[] dy = new int[]{1, 0, -1,  0};
        
        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){
                cnt = 0;
                for(int dirNum = 0; dirNum < 4; dirNum++) {
                    int nx = x + dx[dirNum], ny = y + dy[dirNum];
                    if(inRange(nx, ny, n) && arr[nx][ny] == 1){
                        cnt++;
                    }
                    if(cnt == 3){
                        result++;
                        cnt = 0;
                        break;
                    }
                }
            }
        }
        
        
        System.out.println(result);

    }
}