import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str= sc.nextLine();
        
        int len = str.length();
        int n = sc.nextInt();
        int m = (n > len) ? len : n;
        for(int i = len-1; i >= len - m; i--){
            System.out.print(str.charAt(i));
        }

    }
}