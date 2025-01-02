import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int num = 0;
        int[][] arr = new int[n][m];
        
        // 배열의 숫자를 채웁니다.
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i % 2 == 0) {
                    arr[j][i] = num++;
                } else {
                    arr[n-j-1][i] = num++;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}