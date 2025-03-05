import java.util.*;

public class Main {
    public static int[] dx = new int[]{0, 1, 0, -1};  // R, D, L, U 순서
    public static int[] dy = new int[]{1, 0, -1, 0};   // R, D, L, U 순서
    public static int n, t;

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int t = sc.nextInt();  // 시간 
        int x = sc.nextInt() - 1;  // 초기 행
        int y = sc.nextInt() - 1;  // 초기 열
        String d = sc.next();  // 초기 방향

        // Please write your code here.
        Map<String, Integer> dir = new HashMap<>();
        dir.put("R", 0);
        dir.put("D", 1);
        dir.put("L", 2);
        dir.put("U", 3);
        
        int dirNum = dir.get(d);
        while(t > 0){
            int nx = x + dx[dirNum], ny = y + dy[dirNum];
            
            // 방향 뒤집기 
            if(!inRange(nx, ny)){
                dirNum = (dirNum + 2) % 4;
                t--;
                continue;
            }

            x = nx;
            y = ny;
            t--;
        }
        
        System.out.print((x + 1) + " " + (y + 1));
    }
}