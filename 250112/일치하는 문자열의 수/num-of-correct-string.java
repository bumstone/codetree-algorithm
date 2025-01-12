import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String A = sc.next();
        sc.nextLine();

        
        int cnt = 0;
        for(int i = 0; i < n; i++){
            String B = sc.nextLine();
            if(A.equals(B)){
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}