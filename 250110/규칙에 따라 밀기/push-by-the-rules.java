import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] commend = br.readLine().toCharArray();

        for(int i = 0; i < commend.length; i++){
            if(commend[i] == 'R'){
                str = str.substring(str.length() - 1) + str.substring(0, str.length() - 1);
            } else if (commend[i] == 'L') {
                str = str.substring(1) + str.substring(0, 1);
            }
        }
        System.out.print(str);

    }

}