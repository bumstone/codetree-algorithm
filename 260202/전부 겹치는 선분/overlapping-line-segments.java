import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken());
            x2[i] = Integer.parseInt(st.nextToken());
        }

        String ans = "No";
        for(int i = 1; i < n; i++){
            if(x2[i - 1] < x1[i] || x2[i] < x1[i - 1]) break;
            int overlapStart = Math.max(x1[i - 1], x1[i]);
            int overlapEnd = Math.min(x2[i-1], x2[i]);
            boolean check = true;
            for(int j = 0; j < n; j++){
                if(x2[j] < overlapStart || overlapEnd < x1[j]){
                    check = false;
                    break;
                }
            }
            if(check){
                ans = "Yes";
                break;
            }
        }
        
        System.out.print(ans);
    }
}