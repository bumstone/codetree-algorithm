import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        String str1 = st.nextToken();
        String str2 = st.nextToken();
        
        // if(str1.length() >= 2 && str2.length() >= 2)
        System.out.println(str1.substring(0, 2) + str2.substring(2));
    }
}