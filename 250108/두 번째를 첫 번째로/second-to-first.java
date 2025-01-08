import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();

        char[] arr = str.toCharArray();

        char c = arr[1];
        for(int i = 0; i < arr.length; i++){
            str = String.valueOf(arr).replace(arr[1], arr[0]);
        }

        System.out.print(str);
    }
}