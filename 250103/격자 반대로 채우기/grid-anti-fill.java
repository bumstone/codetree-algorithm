import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        boolean reserve = true;
        int[][] arr = new int[n][n];

        for(int i = n - 1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j--){
                if(reserve){
                    arr[j][i] = num++;
                } else {
                    arr[n - j - 1][i] = num++;
                }
            }
            reserve = !reserve;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}