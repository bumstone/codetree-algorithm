import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int cnt1 = 0;
        int cnt2 = 0;
        
        int index = 0;
        while((index = str.indexOf("ee", index)) != -1) {
            cnt1++;
            index++;
        }
        
        index = 0;
        while((index = str.indexOf("eb", index)) != -1) {
            cnt2++;
            index++;
        }

        System.out.print(cnt1 + " " + cnt2);

    }
}
