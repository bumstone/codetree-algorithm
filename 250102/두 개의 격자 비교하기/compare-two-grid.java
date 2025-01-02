import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        inputMatrix(arr1, sc);
        inputMatrix(arr2, sc);

        sameCheck(arr1, arr2);

        sc.close();
    }

    private static void inputMatrix(int[][] arr, Scanner sc) {
        for(int i = 0; i < arr.length; i++) {
            String[] line = sc.nextLine().split(" ");
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }
    }

    private static void sameCheck(int[][] arr1, int[][] arr2){
        for(int i = 0; i < arr1.length; i++) {
        for(int j = 0; j < arr1[i].length; j++) {
            System.out.print((arr1[i][j] == arr2[i][j] ? 0 : 1) + " ");
        }
        System.out.println();
    }
    }

}