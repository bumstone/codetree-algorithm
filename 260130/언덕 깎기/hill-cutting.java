import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int minAmount = Integer.MAX_VALUE;
        for(int i = 0; i <= 100; i++){
            int amount = 0;
            for(int j = 0; j < n; j++){
                if(i <= arr[j] && arr[j] <= i + 17){
                    continue;
                } else if(arr[j] < i){
                    int x = i - arr[j];
                    amount += x * x;
                } else{
                    int x = arr[j] - (i + 17);
                    amount += x * x;
                }
            }

            minAmount = Math.min(minAmount, amount);
        }

        System.out.print(minAmount);
    }
}
