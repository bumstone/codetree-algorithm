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
        int len = str.length();

        for(int i = 0; i < q; i++){
            int command = Integer.parseInt(br.readLine());
            
            if(command == 1){
                str = str.substring(1) + str.substring(0, 1);
            } else if(command == 2) {
                str = str.substring(len - 1) + str.substring(0, len - 1);
            } else if(command == 3) {
                // 문자열 뒤집기
                str = new StringBuilder(str).reverse().toString();
            }
            
            System.out.println(str);
        }


    }
}