import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
            total += blocks[i];
        }
        Arrays.sort(blocks);
        int avg = total / n;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(blocks[i] < avg){
                ans += avg - blocks[i];
            } 
        }

        System.out.print(ans);
    }
}