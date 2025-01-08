import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        while(str.length() > 1){
            int n = Integer.parseInt(br.readLine());

            if(n >= str.length()){
                str = str.substring(0, str.length() - 1);
            } else {
                str = str.substring(0, n) + str.substring(n + 1);
            }

            System.out.println(str);
        }


    }
}