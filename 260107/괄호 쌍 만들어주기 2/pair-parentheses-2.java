import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String brackets= br.readLine();

        // Please write your code here.
        int len = brackets.length();
        int position = 0;
        int cnt = 0;
        while((position = brackets.indexOf("((", position)) != -1){
            for(int i = position + 2; i < len; i++){
                if((i = brackets.indexOf("))", i)) == - 1){
                    break;
                }
                cnt++;
            }

            position++;
        }
        System.out.print(cnt);
    }
}