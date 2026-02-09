import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++)
            arr[i] = sc.nextInt();
        
        Arrays.sort(arr);
        int[] couple = new int[n];
        int min = arr[2 * n - 1];
        for(int i = 0; i < n; i++){
            couple[i] = arr[i + n] - arr[i];
            min = Math.min(min, couple[i]);
        }

        System.out.print(min);
    }
}