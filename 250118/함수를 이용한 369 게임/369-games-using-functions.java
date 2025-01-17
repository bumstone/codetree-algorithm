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
    if(i % 3 == 0) return true;
    
    int num = i;
    while(num > 0){
        int digit = num % 10;
        if(digit == 3 || digit == 6 || digit == 9){
            return true;
        }
        num /= 10;
    }
    return false;
}
}