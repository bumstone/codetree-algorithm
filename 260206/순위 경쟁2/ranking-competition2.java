import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int A = 0, B = 0;
        int winner = 0;
        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();

            if(c == 'A'){
                A += s;
                if(s > 0 && winner <= A){
                    cnt++;
                    winner = A;
                } else if(s < 0 && winner - s == A && A <= B) cnt++;
            } else {
                B += s;
                if(s > 0 && winner <= B){
                    cnt++;
                    winner = B;
                } else if(s < 0 && winner - s == B && B <= A) cnt++;
            }

        }

        System.out.print(cnt);
    }
}