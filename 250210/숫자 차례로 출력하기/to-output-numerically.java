import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printNum(n, 1);
        System.out.println();
        printReverseNum(n);

    }

    public static void printNum(int n, int current){
        if(n < current){
            return;
        }

        System.out.print(current + " ");
        printNum(n, ++current);
    }
    public static void printReverseNum(int n){
        if(n == 0){
            return;
        } 
        System.out.print(n + " ");
        printReverseNum(n - 1);
    }
}