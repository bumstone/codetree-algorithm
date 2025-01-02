import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int num = 1;
        //arr[1][1] = num;

        // 모든 시작점을 순회
        // 첫 행의 모든 열에서 시작
        for(int startCol = 0; startCol < m; startCol++) {
            int row = 0;
            int col = startCol;
            while(row < n && col >= 0) {
                arr[row][col] = num++;
                row++;
                col--;
            }
        }
        
        // 첫 열을 제외한 마지막 행의 모든 열에서 시작
        for(int startRow = 1; startRow < n; startRow++) {
            int row = startRow;
            int col = m-1;
            while(row < n && col >= 0) {
                arr[row][col] = num++;
                row++;
                col--;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j< m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}