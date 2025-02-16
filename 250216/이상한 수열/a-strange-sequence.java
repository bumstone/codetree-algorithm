import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(strangeArr(n));
    }

    public static int strangeArr(int n){
        if(n == 1){
            return 1;
        } else if(n == 2){
            return 2;
        }

        return strangeArr(n / 3) + strangeArr(n - 1);
    }
}