import java.util.Scanner;
public class Main {
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};
    public static int n;
    public static int m;

    public static boolean isRange(int x, int y){
        return (0 <= x && x < n) && (0 <= y && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.

        int[][] arr = new int[n][m];

        int x = 0, y = 0;
        int dirNum = 0;
        for(int i = 1; i < n * m + 1; i++){
            arr[x][y] = i;

            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            if(!isRange(nx, ny) || arr[nx][ny] != 0){
                dirNum = (dirNum + 1) % 4;
            }

            x = x + dx[dirNum];
            y = y + dy[dirNum];

        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}