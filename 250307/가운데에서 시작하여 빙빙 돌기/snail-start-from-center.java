import java.util.Scanner;

public class Main {
    public static int[] dx = new int[]{0, -1, 0, 1};
    public static int[] dy = new int[]{1, 0, -1, 0};
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[][] arr = new int[n][n];

        int x = n / 2, y = n /2;
        int dir = 0;
        int turn = 1, turnCnt = 0, page = 0;
        for (int i = 1; i <= n * n; i++) {
            int nextX = x + dx[dir], nextY = y + dy[dir];
            
            if(turnCnt >= turn){
                turnCnt = 0;
                page++;
                dir = (dir + 1) % 4;
                if(page == 2){
                    page = 0;
                    turn++;
                }
            }
            turnCnt++;

            arr[x][y] = i;
            
            x += dx[dir];
            y += dy[dir];
        }

        // 출력:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}