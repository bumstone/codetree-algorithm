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
        char c = st.nextToken().charAt(0);

        if(str.indexOf(c) == -1){
            System.out.print("No");
            return;
        }

        System.out.print(str.indexOf(c));

    }
}