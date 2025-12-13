import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        int[] result = calc(a, b);

        System.out.print(result[0] + " " + result[1]);
    }

    public static int[] calc(int a, int b){
        a = a > b ? a * 2 : a + 10;
        b = b > a ? b * 2 : b + 10;

        return new int[]{a, b};
    }
}