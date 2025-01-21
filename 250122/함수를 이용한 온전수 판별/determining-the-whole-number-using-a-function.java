import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for(int i = a; i <= b; i++){
            if(perfectNum(i)){
                cnt++;
            }
        }

        System.out.print(cnt);

        sc.close();
    }

    public static boolean perfectNum(int i){
        if(i % 2 == 0 || i % 10 == 5 || (i % 3 == 0 && i % 9 != 0)){
            return false;
        }

        return true;
    }
}