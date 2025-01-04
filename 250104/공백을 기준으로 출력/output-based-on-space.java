
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[]arr = new String[2];
        arr[0] = br.readLine();
        arr[1] = br.readLine();

        StringBuilder sb = new StringBuilder(arr[0].replaceAll("\\s", "") + arr[1].replaceAll("\\s", ""));

        System.out.println(sb.toString());
    }
}