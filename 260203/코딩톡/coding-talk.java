import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        char[] c = new char[m];
        int[] u = new int[m];
        for (int i = 0; i < m; i++) {
            c[i] = sc.next().charAt(0);
            u[i] = sc.nextInt();
        }
        
        boolean[] Read = new boolean[n];
        if(u[p - 1] == 0) return;
        for(int i = 0; i < m; i++){
            if(u[i] == u[p - 1]){
                Read[c[i] - 'A'] = true;
            } else if(i >= p - 1) 
                Read[c[i] - 'A'] = true;
        }

        for(int i = 0; i < n; i++){
            if (!Read[i]) {
                char notReadPerson = (char) ('A' + i); 
                System.out.print(notReadPerson + " ");
            }
        }
    }
}