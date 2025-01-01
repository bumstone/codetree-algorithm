import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[2][4];
        double sum;
        for(int i= 0; i < 2; i++){
            sum = 0;
            for(int j = 0; j < 4; j++){
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
            }
            System.out.print(sum / 4 + " ");
        }
        System.out.println();

        double total = 0;
        for(int j = 0; j < 4; j++){
            sum = 0;
            for(int i = 0; i < 2; i++){
                sum += matrix[i][j];
            }
            total += sum;
            System.out.print(sum / 2 + " ");
        }
        System.out.println();

        System.out.println(total / 8);
        
    }
}