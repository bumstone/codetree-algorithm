import java.util.Scanner;
public class Main {
    public static int[] dx= new int[]{1,0,-1,0};
    public static int[] dy= new int[]{0,1,0,-1};
    public static int n, m;

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.
        int x = 0, y = 0;
        int dir = 0;
        int[][] arr = new int[n][m];
        for(int i = 1; i <= n * m; i++) { // 숫자 i를 어디에 적을지 결정합니다.
            // 현재 방향 dir를 기준으로 그 다음 위치 값을 계산합니다.
            int nextX = x + dx[dir], nextY = y + dy[dir];

            // 더 이상 나아갈 수 없다면
            // 시계방향으로 90'를 회전합니다.
            if(!inRange(nextX, nextY) || arr[nextX][nextY] != 0)
                dir = (dir + 1) % 4;
            arr[x][y] = i;
            // 그 다음 위치로 이동한 다음 배열에 올바른 값을 채워넣습니다.
            x += dx[dir]; 
            y +=dy[dir];
        }
        
        // 출력:
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}