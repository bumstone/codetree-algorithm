import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int minLength = Integer.MAX_VALUE;
        minLength = Math.min(minLength, Math.abs(A - B));
        minLength = Math.min(minLength, Math.abs(A - x) + Math.abs(B - y));
        minLength = Math.min(minLength, Math.abs(A - y) + Math.abs(B - x));

        System.out.print(minLength);
    }
}