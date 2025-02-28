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

        int firstArea = 0;
        for (int a = rect_x1[0]; a <= rect_x2[0]; a++) {
            for (int b = rect_y1[0]; b <= rect_y2[0]; b++) {
                h[a][b] = 1; 
                firstArea++; 
            }
        }

        // 두 번째 사각형
        rect_x1[1] = sc.nextInt() + 1000;
        rect_y1[1] = sc.nextInt() + 1000;
        rect_x2[1] = sc.nextInt() + 1000;
        rect_y2[1] = sc.nextInt() + 1000;

        int overlapArea = 0;
        for (int a = rect_x1[1]; a <= rect_x2[1]; a++) {
            for (int b = rect_y1[1]; b <= rect_y2[1]; b++) {
                if (h[a][b] == 1) {
                    overlapArea++;  
                }
            }
        }

        int result = firstArea - overlapArea;
        System.out.print(result);
    }
}