import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0, y = 0;
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int dir_num;
        for (int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int dis = sc.nextInt();
            // Please write your code here.
            if(dir == 'E'){
                dir_num = 0;
            } else if(dir == 'S'){
                dir_num = 1;
            } else if(dir == 'W'){
                dir_num = 2;
            } else {
                dir_num = 3;
            }
            
            x += dx[dir_num] * dis;
            y += dy[dir_num] * dis;

        }

        System.out.print(x + " " + y);
    }
}