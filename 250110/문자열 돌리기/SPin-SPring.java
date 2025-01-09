import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int L = str.length();

        for(int i = 0; i <= L; i++){
            System.out.println(str);
            str = str.substring(L - 1) + str.substring(0, L - 1);
        }
    }
}