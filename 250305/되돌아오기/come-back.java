import java.util.*;

public class Main {
    public static int[] dx = new int[]{1,0,-1,0};
    public static int[] dy = new int[]{0,1,0,-1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = 0, x = 0, y = 0;
        int dirNum = 0;

        Map<String, Integer> map = new HashMap<>();
        map.put("E", 0);
        map.put("S", 1);
        map.put("W", 2);
        map.put("N", 3);

        for(int i = 0; i < n; i++){
            String dir = sc.next();
            int dist = sc.nextInt();
            dirNum = map.get(dir);
            for(int j = 0; j < dist; j++){
                x += dx[dirNum];
                y += dy[dirNum];
                time++;
                if(x == 0 && y == 0){
                    System.out.print(time);
                    return;
                }
            }
        }
        
    }
}