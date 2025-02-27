import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];

        int[] h = new int[201];
        Arrays.fill(h, 0);
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            x1[i] += 100;
            x2[i] += 100;

            for(int j = x1[i]; j < x2[i]; j++){
                h[j]++;
            }
        }
        
        
        // Please write your code here.
        int answer = 0;
        for(int i = 0; i < h.length; i++){
            if(answer < h[i]){
                answer = h[i];
            }
        }
        System.out.print(answer);

    }
}