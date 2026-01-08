import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] candies = new int[n];
        int[] positions = new int[n];
        int[] arr = new int[101];
        int lastPosition = 0;
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
            positions[i] = sc.nextInt();
            arr[positions[i]] += candies[i];
            lastPosition = Math.max(lastPosition, positions[i]);
        }

        int maxSum = 0;
        // for(int i = 0; i <= lastPosition; i++){
        //     int sumVal = 0;
        //     for(int j = 0; j < n; j++){
        //         if(Math.abs(positions[j] - i) <= k){
        //             sumVal += candies[j];
        //         }
        //     }

        //     maxSum = Math.max(maxSum, sumVal);
        // }

        for(int i = 0; i <= lastPosition; i++){
            int sumVal = 0;
            for(int j = i; j <= 2 * k + i; j++){
                if(j <= lastPosition) sumVal += arr[j];
            }
            maxSum = Math.max(maxSum, sumVal);
        }


        System.out.println(maxSum);
    }
}