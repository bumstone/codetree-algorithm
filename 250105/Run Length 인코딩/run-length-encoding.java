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
        char c = str.charAt(0);
        int cnt = 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == c){
                cnt++;
            } else {
                sb.append(c).append(cnt);
                c = str.charAt(i);
                cnt = 1;

            }
        }

        sb.append(c).append(cnt);

        System.out.println(sb.length());
        System.out.println(sb.toString());
    }
}