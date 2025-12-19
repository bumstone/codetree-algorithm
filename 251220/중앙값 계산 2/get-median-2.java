import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Please write your code here.
        for(int i = 0; i < n; i++){
            if(i % 2 == 0)
                middleNum(arr, i);
        }

    }

    public static void middleNum(int[] arr, int index){
        int[] someArr = new int[index + 1];

        for(int i = 0; i <= index; i++){
            someArr[i] = arr[i];
        }

        Arrays.sort(someArr);
        System.out.print(someArr[index / 2] + " ");
    }
}