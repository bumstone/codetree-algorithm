import java.util.Scanner;

public class Main {
    public static final int MAX = 1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][2];
        int[] lenA = new int[MAX];
        int[] lenB = new int[MAX];

        int sumTime = 0;
        int sumLength = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
            
            for(int j = 0; j < A[i][1]; j++){
                sumLength += A[i][0];
                lenA[idx++] = sumLength;
            }
            sumTime += A[i][1];
        }

        sumLength = 0;
        idx = 0;
        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();

            for(int j = 0; j < B[i][1]; j++){
                sumLength += B[i][0];
                lenB[idx++] = sumLength;
            }
        }
        
        int winner = 0; // 0: 공동, 1: A선두, 2: B선두
        int cnt = 0;
        for(int i = 0; i < sumTime; i++){
            if(lenA[i] > lenB[i] && winner != 1){
                cnt++;
                winner = 1;
            }
            if(lenA[i] < lenB[i] && winner != 2){
                cnt++;
                winner = 2;
            }
        }

        System.out.println(cnt - 1);
    }
}