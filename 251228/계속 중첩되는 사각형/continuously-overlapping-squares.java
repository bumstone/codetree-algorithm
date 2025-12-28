import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int offset = 100;
        int[][] check = new int[201][201];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            x1 += offset;
            x2 += offset;
            y1 += offset;
            y2 += offset;

            for(int x = x1; x < x2; x++){
                for(int y = y1; y < y2; y++){
                    if(i % 2 == 0) {
                        check[x][y] = 1;   // 빨강
                    } else {
                        check[x][y] = 2;   // 파랑
                    }
                }
            }
        }
        
        int width = 0;
        for(int i = 0; i < 201; i++){
            for(int j = 0; j < 201; j++){
                if(check[i][j] == 2) width++;
            }
        }
        System.out.print(width);

    }
}