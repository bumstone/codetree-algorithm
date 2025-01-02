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

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 0){
                    int row = i;
                    int col = j;

                    while(row < n && col >= 0) {
                        arr[row++][col--] = num++;
                    }
                }
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