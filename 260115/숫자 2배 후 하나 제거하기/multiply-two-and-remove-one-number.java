import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            arr[i] *= 2;
            for(int j = 0; j < n; j++){
                int[] remainingArr = new int[n-1];
                int idx = 0;
                for(int k = 0; k < n; k++){
                    if(k == j) continue;
                    remainingArr[idx++] = arr[k];
                }

                int sum = 0;
                for(int k = 0; k < n - 2; k++) {
                    sum += Math.abs(remainingArr[k + 1] - remainingArr[k]);
                }
                min = Math.min(min, sum);
            }
            arr[i] /= 2;
        }
        System.out.print(min);
    }
}