import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int[] ta = new int[n];
        int[] tb = new int[n];
        for (int i = 0; i < n; i++) {
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = 0;
        
        for(int t = 0; t < 1001; t++){
            int workload = 0;
            for(int i = 0; i < n; i++){
                if(ta[i] > t){
                    workload += c;
                } else if(ta[i] <= t && t <=tb[i]) {
                    workload += g;
                } else {
                    workload += h;
                }

            ans = Math.max(ans, workload);
            }
        }
        

        System.out.print(ans);
    }
}