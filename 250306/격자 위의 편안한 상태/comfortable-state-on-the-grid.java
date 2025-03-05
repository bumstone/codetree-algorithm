import java.util.Scanner;
public class Main {
    public static int[] dx = new int[]{0, 1,  0, -1};
    public static int[] dy = new int[]{1, 0, -1,  0};
    public static int n;

    public static boolean isRange(int x, int y){
        return ((0 <= x && x < n) && (0 <= y && y < n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int[][] arr = new int[n][n];
        int cnt;
        for(int a = 0; a < m; a++){
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            arr[x][y] = 1;
            cnt = 0;

            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(isRange(nx, ny) && (arr[nx][ny] != 0)) {
                    cnt++;
                }
            }

            if(cnt >= 3){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }
}