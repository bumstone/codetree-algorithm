import java.util.Scanner;
public class Main {
    public static int n, m;

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        
        int[] dx = {0, 0, 1, -1,  1, 1, -1, -1};
        int[] dy = {1, -1, 0, 0,  1, -1, 1, -1};

        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int d = 0; d < 8; d++) {
                    int x1 = i, y1 = j;
                    int x2 = i + dx[d], y2 = j + dy[d];
                    int x3 = i + 2 * dx[d], y3 = j + 2 * dy[d];

                    if (!inRange(x2, y2) || !inRange(x3, y3)) continue;

                    char c1 = arr[x1].charAt(y1);
                    char c2 = arr[x2].charAt(y2);
                    char c3 = arr[x3].charAt(y3);

                    if (c1 == 'L' && c2 == 'E' && c3 == 'E') cnt++;
                }
            }
        }
        
        System.out.print(cnt);
    }
}