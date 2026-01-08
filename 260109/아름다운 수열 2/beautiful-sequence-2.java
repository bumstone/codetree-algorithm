import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++)
            B[i] = sc.nextInt();
        
        Arrays.sort(B);

        int cnt = 0;
        for(int i = 0; i < N - M + 1; i++){
            int[] subA = Arrays.copyOfRange(A, i, i + M);
            Arrays.sort(subA);
            boolean isMatch = true;
            for(int j = 0; j < M; j++){
                if(subA[j] != B[j]){
                    isMatch = false;
                    break;
                }
            }

            if(isMatch) cnt++;
        }
        

        System.out.print(cnt);
    }
}