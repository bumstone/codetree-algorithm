import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        StringBuilder sb = new StringBuilder(str1.replaceAll("\\s", "") + str2.replaceAll("\\s", ""));

        System.out.println(sb.toString());
    }
}