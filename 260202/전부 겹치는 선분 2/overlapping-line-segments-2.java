import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        String ans = "No";
        for(int i = 0; i < n; i++){
            int maxX1 = 0;
            int minX2 = 100;
            for(int j = 0; j < n; j++){
                if(i == j) continue; 
                maxX1 = Math.max(maxX1, x1[j]);
                minX2 = Math.min(minX2, x2[j]);
            }
            if(maxX1 <= minX2){
                ans = "Yes";
                break;
            }
        }
        System.out.print(ans);
    }
}