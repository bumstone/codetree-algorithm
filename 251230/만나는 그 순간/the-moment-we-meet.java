import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cur = 0;
        int curA = 1000 * n;
        int curB = 1000 * m;

        int[] A = new int[n * 2000 + 1];
        int[] B = new int[m * 2000 + 1];
        int sumTime = 0;
        int idx = 0;
        for(int i = 0; i < n; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            sumTime += t;
            
            if(d == 'R'){
                while(t-- > 0){
                    A[idx++] = cur;
                    if(t > 0) cur++;
                }
            } else if(d == 'L'){
                while(t-- > 0){
                    A[idx++] = cur;
                    if(t > 0) cur--;
                }
            }
        }

        idx = 0;
        cur = 0;
        for(int i = 0; i < m; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            
            if(d == 'R'){
                while(t-- > 0){
                    B[idx++] = cur;
                    if(t > 0) cur++;
                }
            } else if(d == 'L'){
                while(t-- > 0){
                    B[idx++] = cur;
                    if(t > 0) cur--;
                }
            }
        }

        for(int i = 1; i <= sumTime; i++){
            if(A[i] == B[i]){
                System.out.println(i + 1);
                return; 
            }
        }
        System.out.println("-1");
    }
}