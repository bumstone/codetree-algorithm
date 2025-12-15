import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        star(N, "*");
    }

    public static void star(int N, String shape){
            if(N < 1) return;
            star(N-1, shape);
            for(int i = N; i > 0; i--){
                System.out.print(shape);
            }
            System.out.println();
    }
}