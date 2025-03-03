import java.util.Scanner;

public class Main {
    public static int[] dx = new int[]{1, 0,  -1, 0};
    public static int[] dy = new int[]{0,  -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] command = s.toCharArray();
        int x = 0, y = 0;
        int dir = 3;
        // Please write your code here.
        for(int i = 0; i < command.length; i++){
            if(command[i] == 'L'){
                dir = (dir + 3) % 4;
            } else if(command[i] == 'R'){
                dir = (dir + 1) % 4;
            } else if(command[i] == 'F'){
                x += dx[dir];
                y += dy[dir];
            }
        }

        System.out.print(x+ " " + y);
    }
}