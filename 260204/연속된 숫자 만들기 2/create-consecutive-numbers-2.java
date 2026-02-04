import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        
        int minMovement = 0;
        while(true){
            if(a + 1 == b && a + 2 == c) break;
            if(a + 2 == b || b + 2 == c){
                minMovement++;
                break;
            }
            if(Math.abs(b - a) > Math.abs(c - b)){
                a = b;
                b = b + 1;
            } else if(Math.abs(b - a) <= Math.abs(c - b)){
                c = b;
                b = b - 1;
            }

            minMovement++;
        }
        System.out.print(minMovement);
    }
}
