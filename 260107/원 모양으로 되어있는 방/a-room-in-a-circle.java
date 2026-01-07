import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int total = 0;    // 총 인원
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int idx = i;
            int person = total;
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum += arr[(i + j) % n] * j;
                person -= arr[(i + j) % n];
                if(person <= 0) break;
            }
            min = Math.min(min, sum);
        }

        System.out.print(min);
    }
}