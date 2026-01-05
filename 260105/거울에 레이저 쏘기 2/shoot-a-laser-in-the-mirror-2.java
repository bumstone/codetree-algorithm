import java.util.Scanner;

public class Main {
    public static int[] dx = new int[]{1, 0, -1, 0}; 
    public static int[] dy = new int[]{0, -1, 0, 1};

    public static int n;
    public static int x, y;
    public static int dir = 0;

    public static boolean isRange(int x, int y){
        return ((0 <= x && x < n) && (0 <= y && y < n));
    }

    // startNum으로 방향과 처음 x, y위치 지정 
    public static void firstPosition(int startNum){
        dir = startNum / n;
        if(dir == 0) {
            x = 0; y = startNum - 1;
        } else if(dir == 1){
            x = startNum - n - 1;
            y = n - 1;
        } else if(dir == 2){
            x = n - 1;
            y = 3 * n - startNum;
        } else {
            x = 4 * n - startNum;
            y = 0;
        }
    }

    public static void sideMirror(char mirror){
        if(mirror == '/'){
            if(dir % 2 == 0){
                dir = (dir + 1) % 4;
            } else {
                dir = (dir - 1 + 4) % 4;
            }
        }

        if(mirror == '\\'){
            if(dir % 2 == 0){
                dir = (dir - 1 + 4) % 4;
            } else {
                dir = (dir + 1) % 4;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        int startNum = sc.nextInt();
        int ans = 0;

        firstPosition(startNum);
        
        while(isRange(x, y)){
            sideMirror(grid[x][y]);

            ans++;
            x += dx[dir];
            y += dy[dir];
        }
        
        System.out.println(ans);
    }
}