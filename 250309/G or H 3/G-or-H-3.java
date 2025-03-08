import java.util.Scanner;
public class Main {
    public static final int L = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[L];
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);
            x[i] = pos;
            if(c == 'G') arr[pos] = 1;
            else if(c == 'H') arr[pos] = 2;
        }
        // Please write your code here.

        int ans = 0, point;     
        for(int st = 1; st < L - k + 1; st++){
            point = 0;
            int ed = st + k;
            for(int i = 0; i < n; i++){
                if(st <= x[i] && x[i] <= ed){
                    point += arr[x[i]];
                }
            }

            // for(int j = i; j < i + k; j++){
            //     point += arr[j];
            // }
            ans = Math.max(ans, point);


        }
        System.out.print(ans);
    }
}