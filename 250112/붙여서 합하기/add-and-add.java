import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.print(Integer.parseInt(str1 + str2) + Integer.parseInt(str2 + str1));
    }
}