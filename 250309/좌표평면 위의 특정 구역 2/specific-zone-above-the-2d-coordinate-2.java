import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int maxX = 1, maxY = 1;
            int minX = 40000, minY = 40000;
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                maxX = Math.max(maxX, x[j]);
                maxY = Math.max(maxY, y[j]);
                minX = Math.min(minX, x[j]);
                minY = Math.min(minY, y[j]);
            }
            result = Math.min(result, (maxX - minX) * (maxY - minY));

        }

        System.out.print(result);
    }
}