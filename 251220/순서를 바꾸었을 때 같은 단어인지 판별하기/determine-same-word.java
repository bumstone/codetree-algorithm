import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please Write your code.

        if(isSame(word1, word2))
            System.out.println("Yes");
        else System.out.println("No");
    }

    public static boolean isSame(String a, String b){
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();

        Arrays.sort(ac);
        Arrays.sort(bc);

        return Arrays.equals(ac, bc);
    }
}