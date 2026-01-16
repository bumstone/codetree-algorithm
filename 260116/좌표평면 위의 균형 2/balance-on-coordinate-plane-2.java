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
        
        int ans = Integer.MAX_VALUE;
        for(int xL = 2; xL < 100; xL += 2){
            for(int yL = 2; yL < 100; yL += 2){
                int areaMax = 0;
                int a1 = 0, a2 = 0, a3 = 0, a4 = 0;
                for(int i = 0; i < n; i++){
                    if(xL < x[i] && yL < y[i]) a1++;
                    else if(xL < x[i] && yL > y[i]) a2++;
                    else if(xL > x[i] && yL < y[i]) a3++;
                    else if(xL > x[i] && yL > y[i]) a4++;
                }
                areaMax = Math.max(Math.max(a1, a2), Math.max(a3, a4));
                ans = Math.min(ans, areaMax);
            }
        }


        System.out.print(ans);
    }
}