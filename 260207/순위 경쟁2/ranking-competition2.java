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
                if(s > 0 && ((winner < A && A < winner + s) || A == B + s || A == B)){
                    cnt++;
                    winner = A;
                } else if(s < 0 && winner + s == A && A <= B) {
                    cnt++;
                    winner = B;
                }
            } else {
                B += s;
                if(s > 0 && ((winner < B && B < winner + s) || A + s == B || A == B)){
                    cnt++;
                    winner = B;
                } else if(s < 0 && winner + s == B && B <= A){
                    cnt++;
                    winner = A;
                }
            }

        }

        System.out.print(cnt);
    }
}