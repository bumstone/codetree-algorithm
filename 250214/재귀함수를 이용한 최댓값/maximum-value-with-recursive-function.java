import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        System.out.println(findMax(numbers, 0, n-1));
    }

    public static int findMax(int[] arr, int start, int end){
        if(start == end) {
            return arr[start];
        }
        
        int mid = (start + end) / 2;
        int startMax = findMax(arr, start, mid);
        int endMax = findMax(arr, mid + 1, end);
        
        return Math.max(startMax, endMax);
    }
}