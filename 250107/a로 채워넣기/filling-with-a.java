import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();

        char[] arr = str.toCharArray();

        arr[1] = 'a';
        arr[str.length() - 2] = 'a';

        System.out.println(String.valueOf(arr));
    }
}