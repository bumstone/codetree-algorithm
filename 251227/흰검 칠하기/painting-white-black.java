import java.util.Scanner;
public class Main {
    public static final int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int current = 100 * N;
        int[] check = new int[200 * N + 1];
        // int[] checkW = new int[200 * N + 1];
        // int[] checkB = new int[200 * N + 1];

        char[] d = new char[N];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            d[i] = sc.next().charAt(0);

            if(d[i] == 'R'){
                for(int j = current; j < current + x; j++){
                    check[j]++;
                }
                current += x;
            } else if(d[i] == 'L'){
                for(int j = current - x; j < current; j++){
                    check[j]++;
                }
                current -= x;
            }

        }
        
        int whiteCnt = 0;
        int blackCnt = 0;
        int grayCnt = 0;
        for(int i = 0; i < check.length; i++){
            if(check[i] >= 4) grayCnt++;
            else if(check[i] <= 0) continue;
            else if(i < current) blackCnt++;
            else if(i > current) whiteCnt++; 
            else if(i == current) {
                if(d[d.length - 1] == 'R') blackCnt++;
                if(d[d.length - 1] == 'L') whiteCnt++;
            }
        }

        System.out.println(whiteCnt + " " + blackCnt + " " + grayCnt);
    }
}