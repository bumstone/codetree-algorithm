import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N+1];
        Arrays.fill(arr, 0);
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for(int j = A; j <= B; j++){
                arr[j]++;
            }
        }
        // Please write your code here.

        int answer = 0;
        for(int i = 0; i < N + 1; i++){
            if(answer < arr[i]){
                answer = arr[i];
            }
        }

        System.out.print(answer);
    }
}