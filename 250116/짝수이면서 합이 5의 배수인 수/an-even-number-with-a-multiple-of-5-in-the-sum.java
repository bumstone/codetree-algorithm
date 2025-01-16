import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(isMagicNumber(n)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isMagicNumber(int n){
        int digitNum = 0;
        int num = n;
        while(num != 0){
            digitNum += (num % 10);
            num /= 10;
        }
        return n % 2 == 0 && digitNum % 5 == 0;
    }
}