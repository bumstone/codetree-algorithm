import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 2; j < n; j++){
                int sum = 0;
                sum = arr[i] + arr[j];
                max = Math.max(max, sum);
            }
        }

        System.out.print(max);
    }
}