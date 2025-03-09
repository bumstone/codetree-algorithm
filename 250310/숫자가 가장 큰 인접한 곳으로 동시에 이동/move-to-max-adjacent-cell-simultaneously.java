import java.util.*;
public class Main {
    public static int n;
    public static int cx, cy;


    public static boolean inRange(int x, int y){
        return (0 <= x && x < n) && (0 <= y && y < n);
    }

    public static void simulate(int x, int y, int[][] grid){
        int[] dx = new int[]{-1,1,0,0};
        int[] dy = new int[]{0,0,-1,1};

        int max = 0;
        cx = x;
        cy = y;
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i], ny = y + dy[i];
            if(inRange(nx, ny) && grid[nx][ny] > max){
                max = grid[nx][ny];
                cx = nx;
                cy = ny;
            }
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        int T = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int[][] marbles = new int[m][2];
        for (int i = 0; i < m; i++) {
            marbles[i][0] = sc.nextInt() - 1;
            marbles[i][1] = sc.nextInt() - 1;
        }
        // Please write your code here.
        for(int t = 0; t < T; t++){
            for(int j = 0; j < m; j++){
                simulate(marbles[j][0], marbles[j][1], grid);
                marbles[j][0] = cx;
                marbles[j][1] = cy;
            }

            // 충돌 처리
            boolean[] removed = new boolean[m];
            for (int i = 0; i < m; i++) {
                if (removed[i]) continue;
                for (int j = i + 1; j < m; j++) {
                    if (marbles[i][0] == marbles[j][0] && marbles[i][1] == marbles[j][1]) {
                        removed[i] = true;
                        removed[j] = true;
                    }
                }
            }

            // 구슬 제거
            ArrayList<int[]> newMarbles = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                if (!removed[i]) {
                    newMarbles.add(new int[]{marbles[i][0], marbles[i][1]});
                }
            }
            marbles = new int[newMarbles.size()][2];
            for (int i = 0; i < newMarbles.size(); i++) {
                marbles[i] = newMarbles.get(i);
            }

            m = marbles.length;
        }

        System.out.print(m);
    }
}