import java.util.Scanner;
public class Main {
    public static int n, x, y;

    public static boolean inRange(int x, int y){
        return (1 <= x && x <= n) && (1 <= y && y <= n);
    }

    public static int simulate(int[][] grid){
        int max = 0;

        int[] dx = new int[]{-1,1,0,0};
        int[] dy = new int[]{0,0,-1,1};

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(inRange(nx, ny) && grid[nx][ny] > grid[x][y]){
                max = grid[nx][ny];
                x = nx;
                y = ny;
                return max;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        int[][] grid = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int ans = grid[x][y];
        System.out.print(ans + " ");
        while ((ans = simulate(grid)) != -1) {
            System.out.print(ans + " ");
        }


    }
}