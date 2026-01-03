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


        int i = 0;
        while (i < T) {
            int curT = shakes[i].t;
            int j = i;
            boolean[] toInfect = new boolean[N];

            while (j < T && shakes[j].t == curT) j++;

            for (int idx = i; idx < j; idx++) {
                int a = shakes[idx].x;
                int b = shakes[idx].y;

                if (result[a] == 1 && kCnt[a] < K) {
                    kCnt[a]++;
                    if (result[b] == 0) {
                        toInfect[b] = true;
                        result[b] = 1;
                    } 
                }

                if (result[b] == 1 && kCnt[b] < K) {
                    kCnt[b]++;
                    if (result[a] == 0) {
                        toInfect[a] = true;
                        result[a] = 1;
                    } 
                }
            }

            // 이 시간 끝나고 감염 반영 + 사용횟수 초기화
            for (int p = 0; p < N; p++) {
                if (toInfect[p] && result[p] == 0) {
                    result[p] = 1;
                }
            }

            i = j;
        }


        for(int j = 0; j < N; j++){
            System.out.print(result[j]);
        }
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