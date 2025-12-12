import java.util.Scanner;


public class Main {

    public static int[] abs(int[] N){
        
        for (int i = 0; i < N.length; i++) {
            if(N[i] < 0)
                N[i] = -N[i];
        }

        return N;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] N = new int[n];

        for(int i = 0; i < n; i++){
            N[i] = sc.nextInt();
        }
        
        int[] result = abs(N);
        for(int i = 0; i < n; i++){
            System.out.print(result[i] + " ");
        }
        
    }
}