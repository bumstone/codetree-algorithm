import java.util.*;

public class Main {
    public static int[] dx = new int[]{0,1,0,-1};
    public static int[] dy = new int[]{-1,0,1,0};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();

        int time = 0, x = 0, y = 0;
        int dirNum = 0;
        // Please write your code here.
        for(int i = 0; i < commands.length(); i++){
            if(commands.charAt(i) == 'R'){
                dirNum = (dirNum + 1) % 4;
                time++;
                continue;
            } else if(commands.charAt(i) == 'L'){
                dirNum = (dirNum + 3) % 4;
                time++;
                continue;
            } 
            x += dx[dirNum];
            y += dy[dirNum];
            time++;
            if(x == 0 && y == 0){
                System.out.print(time);
                return;
            }
        }

        System.out.print(-1);
    }
}

