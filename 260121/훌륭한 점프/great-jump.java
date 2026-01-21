import java.util.Scanner;
public class Main {
    public static int n, k;
    public static int[] arr = new int[101];

    public static boolean isPossible(int a){
        int[] counting = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] <= a){
                counting[cnt++] = i;
            }
        }

        for(int i = 1; i < cnt; i++){
            int diff = counting[i] - counting[i - 1];
            if(diff > k) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int ans = 100;
        for(int i = 100; i >= Math.max(arr[0], arr[n - 1]); i--){
            if(isPossible(i)) 
                ans = Math.min(ans, i);
        }

        System.out.print(ans);
    }
}