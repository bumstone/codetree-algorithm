
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str1 = br.readLine();
        String str2 = br.readLine();

        StringBuilder sb = new StringBuilder(str1.replaceAll("\\s", "") + str2.replaceAll("\\s", ""));

        System.out.println(sb.toString());
    }
}