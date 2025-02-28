import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect_x1[] = new int[2];
        int rect_x2[] = new int[2];
        int rect_y1[] = new int[2];
        int rect_y2[] = new int[2];

        int[][] h = new int[2001][2001];

        // 첫 번째 사각형
        rect_x1[0] = sc.nextInt() + 1000;
        rect_y1[0] = sc.nextInt() + 1000;
        rect_x2[0] = sc.nextInt() + 1000;
        rect_y2[0] = sc.nextInt() + 1000;

        for (int a = rect_x1[0]; a < rect_x2[0]; a++) {
            for (int b = rect_y1[0]; b < rect_y2[0]; b++) {
                h[a][b] = 1; 
            }
        }

        // 두 번째 사각형
        rect_x1[1] = sc.nextInt() + 1000;
        rect_y1[1] = sc.nextInt() + 1000;
        rect_x2[1] = sc.nextInt() + 1000;
        rect_y2[1] = sc.nextInt() + 1000;

        for (int a = rect_x1[1]; a < rect_x2[1]; a++) {
            for (int b = rect_y1[1]; b < rect_y2[1]; b++) {
                h[a][b] = 2;
            }
        }

        // 1, 2 순으로 붙였는데도
        // 아직 숫자 1로 남아있는 곳들 중 최대 최소 x, y 값을 전부 계산합니다.
        int minX = h.length, maxX = 0, minY = h.length, maxY = 0;
        boolean firstRectExist = false;
        for(int x = 0; x < h.length; x++)
            for(int y = 0; y < h[x].length; y++)
                if(h[x][y] == 1) {
                    firstRectExist = true;
                    minX = Math.min(minX, x);
                    maxX = Math.max(maxX, x);
                    minY = Math.min(minY, y);
                    maxY = Math.max(maxY, y);
                }
        
        // 넓이를 계산합니다.
        int area;
        // Case 1. 첫 번째 직사각형이 전혀 남아있지 않다면 넓이는 0입니다.
        if(!firstRectExist)
            area = 0;
        // Case 2. 첫 번째 직사각형이 남아있다면, 넓이를 계산합니다.
        else
            area = (maxX - minX + 1) * (maxY - minY + 1);

        System.out.print(area);
    }
}