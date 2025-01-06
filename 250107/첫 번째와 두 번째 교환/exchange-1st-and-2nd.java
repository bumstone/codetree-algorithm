import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        
        char first = str.charAt(0);
        char second = str.charAt(1);
        
        String result = str.replace(first, '*').replace(second, first).replace('*', second);

        System.out.print(result);

    }
}