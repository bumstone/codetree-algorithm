import java.util.Scanner;

public class Main {
    public static int[] arr = new int[6];
    public static int getDiff(int i, int j, int k){
        int sum1 = arr[i] + arr[j] + arr[k];
        int sum2 = 0;
        for(int l = 0; l < 6; l++){
            sum2 += arr[l];
        }
        sum2 -= sum1;
        return Math.abs(sum2 - sum1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 6; i++){
            for(int j = i + 1; j < 6; j++){
                for(int k = j + 1; k < 6; k++){
                    min = Math.min(min, getDiff(i, j, k));
                }
            }
        }

        System.out.print(min);
    }
}