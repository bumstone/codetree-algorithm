import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int max = 0;
        int sum;
        for(int i = 0; i < n - 2; i++){
            for(int j = 0; j < n - 2; j++){
                sum = 0;
                for(int a = 0; a < 3; a++){
                    for(int b = 0; b < 3; b++){
                        sum += grid[i+a][j+b];
                    }
                }
                max = Math.max(max, sum);
            }
        }

        System.out.println(max);
    }
}