import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        int q = Integer.parseInt(st.nextToken());

        String result = str;
        for(int i =0; i< q; i++){
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            

            if(command == 1){
                int a = Integer.parseInt(st.nextToken()) - 1;
                int b = Integer.parseInt(st.nextToken()) - 1;
                char[] arr = result.toCharArray();
                char tmp = arr[b];
                arr[b] = arr[a];
                arr[a] = tmp;

                result = String.valueOf(arr);
            } else {
                String c1 = st.nextToken(); 
                String c2 = st.nextToken(); 
                result = result.replace(c1, c2);
            }
            
            System.out.println(result);
        }
    }
}