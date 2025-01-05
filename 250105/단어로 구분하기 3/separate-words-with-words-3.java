import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] strArray = str.split("\\s+");

        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.println(strArray[i]);
        }
    }
}