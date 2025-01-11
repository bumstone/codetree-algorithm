import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        String str = br.readLine();


        for(char c : str.toCharArray()){
            if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                result.append(Character.toLowerCase(c));
            }
        }
        System.out.print(result.toString());
    }
}