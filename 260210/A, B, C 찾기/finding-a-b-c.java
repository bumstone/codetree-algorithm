import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int A = arr[0], B = arr[1], C;
        if(A + B > arr[2]) C = arr[2];
        else C = arr[3];
        System.out.print(A + " " + B + " " + C);
    }
}