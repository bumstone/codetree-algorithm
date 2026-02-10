import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] x1= new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken());
            x2[i] = Integer.parseInt(st.nextToken());
        }
        int ans = 100;
        for(int i = 0; i < n; i++){
            int start = 100, end = 1;
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                start = Math.min(start, x1[j]);
                end = Math.max(end, x2[j]);
            }
            ans = Math.min(ans, end - start);
        }

        System.out.print(ans);
    }
}