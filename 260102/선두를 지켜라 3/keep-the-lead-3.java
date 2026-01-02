import java.util.Scanner;
public class Main {

    public static final int MAX = 1000001;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][2];
        int[][] b = new int[m][2];

        int[] lenA = new int[MAX];
        int[] lenB = new int[MAX];

        int sumTime = 0;
        int sumLength = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();

            for(int j = 0; j < a[i][1]; j++){
                sumLength += a[i][0];
                lenA[idx++] = sumLength;
            }
            sumTime += a[i][1];
        }

        sumLength = 0;
        idx = 0;
        for (int i = 0; i < m; i++) {
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();

            for(int j = 0; j < b[i][1]; j++){
                sumLength += b[i][0];
                lenB[idx++] = sumLength;
            }
        }
    
        
        int winner = 0; // 0: 공동, 1: A선두, 2: B선두
        int cnt = 0;
        for(int i = 1; i < sumTime; i++){
            if(lenA[i] == lenB[i] && winner != 0){
                cnt++;
                winner = 0;
            }
            if(lenA[i] > lenB[i] && winner != 1){
                cnt++;
                winner = 1;
            }
            if(lenA[i] < lenB[i] && winner != 2){
                cnt++;
                winner = 2;
            }
        }

        System.out.println(cnt);
        
    }
}
