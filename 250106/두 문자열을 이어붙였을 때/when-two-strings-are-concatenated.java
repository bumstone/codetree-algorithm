import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        String A = br.readLine();
        String B = br.readLine();

        sb1.append(A).append(B);
        sb2.append(B).append(A);

        if(sb1.toString().equals(sb2.toString())){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        
    }
}