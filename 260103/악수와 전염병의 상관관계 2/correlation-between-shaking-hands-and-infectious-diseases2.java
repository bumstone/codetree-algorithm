import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 개발자수
        int K = sc.nextInt();   // 전염 가능 횟수
        int P = sc.nextInt();   // 처음 전염병에 걸린 개발자의 번호 
        int T = sc.nextInt();   // t초에 x, y 개발자가 악수를 한 횟수
        
        Shake[] shakes = new Shake[T];
        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            shakes[i] = new Shake(t, x - 1, y - 1);
        }
        
        Arrays.sort(shakes, (a, b) -> a.t - b.t);
        
        int[] result = new int[N];
        result[P-1] = 1;
        int[] kCnt = new int[N];    // 전염 가능 남은 횟수 


        for (int i = 0; i < T; i++) {
            int x = shakes[i].x;
            int y = shakes[i].y;
            boolean xIsInfected = (result[x] == 1);
            boolean yIsInfected = (result[y] == 1);

            if(xIsInfected && kCnt[x] < K){
                result[y] = 1;
                kCnt[x]++;
            }
            if(yIsInfected && kCnt[y] < K){
                result[x] = 1;
                kCnt[y]++;
            }
        }


        StringBuilder sb = new StringBuilder();
        for (int res : isInfected) {
            sb.append(res);
        }
        System.out.println(sb.toString());
    }
}

class Shake {
    int t, x, y;
    Shake(int t, int x, int y) {
        this.t = t;
        this.x = x;
        this.y = y;
    }
}