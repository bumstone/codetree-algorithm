import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();

        if(isDate(M, D)){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }

    public static boolean isDate(int M, int D){
        if (M < 1 || M > 12) {
            return false;
        }
        
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (D < 1 || D > daysInMonth[M-1]) {
            return false;
        }
        
        return true;
    }

}