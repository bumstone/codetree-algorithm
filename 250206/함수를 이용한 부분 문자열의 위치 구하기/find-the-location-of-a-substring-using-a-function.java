import java.util.Scanner;

public class Main {
    public static String str;
    public static String part;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();
        part = sc.nextLine();

        System.out.print(strIndex());

    }

    public static int strIndex(){
        return str.indexOf(part);
    }
}