import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = -1;
        int min = 100;
        for(int i = 0; i < N; i++){
            min = Math.min(min, arr[i]);
        }
        
        int second = 100;
        for(int i = 0; i < N; i++){
            if(arr[i] == min) continue;
            if(second > arr[i]){
                second = arr[i];
                ans = i + 1;
            }
        }

        for(int i = 0; i < N; i++){
            if(second == arr[i] && ans != i + 1){
                ans = -1;
                break;
            }
        }
        System.out.print(ans);
    }
}