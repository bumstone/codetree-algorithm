import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int len = str.length();

        for(int i = 0; i < len; i++){
            if(i % 2 == 1){
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb.reverse().toString());

    }
}