import java.util.Scanner;

public class Main {
    public static int[] dx = new int[]{-1, 0, 1, 0};    // URDL 시계
    public static int[] dy = new int[]{0, 1, 0, -1};
    public static int n;
    public static int x, y;
    public static int dir = 0;

    public static boolean isRange(int x, int y){
        return ((0 <= x && x < n) && (0 <= y && y < n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int t = sc.nextInt();
        char[] commands = sc.next().toCharArray();
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        
        x = n / 2;
        y = n / 2;
        int ans = board[x][y];
        for(int i = 0; i < commands.length; i++){
            if(commands[i] == 'L'){
                dir = (dir + 3) % 4;
            } else if(commands[i] == 'R'){
                dir = (dir + 1) % 4;
            } else {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if(!isRange(nx, ny)) continue;

                x += dx[dir];
                y += dy[dir];
                ans += board[x][y];
            }
        }


        System.out.print(ans);
    }
}