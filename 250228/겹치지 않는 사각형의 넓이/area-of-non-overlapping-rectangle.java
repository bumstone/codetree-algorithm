import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();
        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();
        int mx1 = sc.nextInt();
        int my1 = sc.nextInt();
        int mx2 = sc.nextInt();
        int my2 = sc.nextInt();
        // Please write your code here.
        int[][] h = new int[2001][2001];
        for(int i = ax1 + 1000; i < ax2 + 1000; i++){
            for(int j = ay1 + 1000; j < ay2 + 1000; j++){
                h[i][j] = 1;
            }
        }

        for(int i = bx1 + 1000; i < bx2 + 1000; i++){
            for(int j = by1 + 1000; j < by2 + 1000; j++){
                h[i][j] = 1;
            }
        }

        for(int i = mx1 + 1000; i < mx2 + 1000; i++){
            for(int j = my1 + 1000; j < my2 + 1000; j++){
                h[i][j] = 0;
            }
        }

        int width = 0;
        for(int i = 0; i < h.length; i++){
            for(int j = 0; j < h[i].length; j++){
                if(h[i][j] == 1){
                    width++;
                }
            }
        }
        
        System.out.print(width);
        
    }
}