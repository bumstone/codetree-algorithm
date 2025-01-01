import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[2][4];
        double sum;
        for(int i = 0; i < 2; i++){
            sum = 0;
            for(int j = 0; j < 4; j++){
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
            }
            System.out.printf("%.1f ", sum / 4);
        }
        System.out.println();

        double total = 0;
        for(int j = 0; j < 4; j++){
            sum = 0;
            for(int i = 0; i < 2; i++){
                sum += matrix[i][j];
            }
            total += sum;
            System.out.printf("%.1f ", sum / 2);
        }
        System.out.println();

        System.out.printf("%.1f", total / 8);
    }
}