import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];

        int[][] h = new int[201][201];
        Arrays.fill(h, 0);
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();

            x1[i] += 100;
            x2[i] += 100;
            y1[i] += 100;
            y2[i] += 100;

            for(int x = x1[i]; x <= x2[i]; x++){
                for(int y = y1[i]; y <= yx[i]; y++){
                    h[x][y]++;
                }
            }
        }
        // Please write your code here.
        int width = 0;
        for(int i = 0; i < 201; i++){
            for(int j = 0; j < 201; j++){
                if(h[x][y] == 0) continue;
                width++;
            }
        }
        System.out.print(width);

    }
}