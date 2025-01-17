import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(countNum(a, b));

    }

    public static int countNum(int a, int b){
        int cnt = 0;
        for(int i = a; i <= b; i++){
            if(isMagicNum(i)){
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean isMagicNum(int i){
        char[] arr = Integer.toString(i).toCharArray();

        for(char c : arr) {
            if(c == '3' || c == '6' || c == '9' || i % 3 == 0) {
                return true;
            }
        }

        return false;
    }
}