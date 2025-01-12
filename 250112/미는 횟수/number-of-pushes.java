import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();
        int n = -1;

        for(int i =0; i < A.length(); i++){
            if(!A.equals(B)){
                A = A.substring(A.length()-1) + A.substring(0, A.length() - 1);
            } else {
                n = i;
                break;
            }
        }

        System.out.println(n);
    }
}