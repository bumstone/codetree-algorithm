import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String word = br.readLine();

        int len = word.length();

        while(str.contains(word)){
            int idx = str.indexOf(word);

            str = str.substring(0, idx) + str.substring(idx + len);
        }

        System.out.print(str);

    }
}