import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // n장의 색종이 8,8
        int[] x = new int[n];
        int[] y = new int[n];
        int[][] h = new int[201][201];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            x[i] += 100;
            y[i] = sc.nextInt();
            y[i] += 100;

            for(int a = x[i]; a < x[i] + 8; a++){
                for(int b = y[i]; b < y[i] + 8; b++){
                    h[b][a] = 1;
                }
            }

        }
        // Please write your code here.
        int answer = 0;
        for(int i =0; i < h.length; i++){
            for(int j = 0; j < h[i].length; j++){
                if(h[i][j] != 0){
                    answer++;
                }
            }
        }
        System.out.print(answer);

    }
}