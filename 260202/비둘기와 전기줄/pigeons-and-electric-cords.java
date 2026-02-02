import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int[] pos = new int[11];
        for(int i = 0; i < 11; i++){
            pos[i] = -1;
        }

        for (int i = 0; i < N; i++) {
            int pigeon = sc.nextInt();
            int moveDir = sc.nextInt();
            if(pos[pigeon] != -1 && pos[pigeon] != moveDir) cnt++;
            pos[pigeon] = moveDir;
        }

        System.out.print(cnt);
    }
}