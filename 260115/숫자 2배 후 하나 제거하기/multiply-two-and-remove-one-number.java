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
                int sum = 0;
                for(int k = 0; k < n; k++){
                    if(j == k || k == n - 1) continue;
                    sum += Math.abs(arr[k + 1] - arr[k]);
                }
                min = Math.min(min, sum);
            }
            arr[i] /= 2;
        }
        System.out.print(min);
    }
}