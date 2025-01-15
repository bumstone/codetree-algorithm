import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();

        printMin(a, b, c);

    }

    public static void printMin(int a, int b, int c){
        int min = (a > b) ? (b > c ? c : b) : (a > c ? c : a);
        
        System.out.println(min);
    }
}