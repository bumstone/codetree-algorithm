import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        printNum(n);
    }

    public static void printNum(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printNum(n - 1);
        System.out.print(n + " ");
    }
}