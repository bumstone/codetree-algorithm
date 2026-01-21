import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static final int MAX = 15;
    public static int[] arr = new int[MAX];
    public static int[] cal = new int[MAX];

    public static boolean isEqualArray(){
        Arrays.sort(cal);

        for(int i = 0; i < 15; i++){
            if(arr[i] != cal[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);

        int A = arr[0], B = arr[1], C, D;
        for(int i = 2; i < 15; i++){
            C = arr[i];
            for(int j = i + 1; j < 15; j++){
                D = arr[j];
                int idx = 0;

                cal[idx++] = A;
                cal[idx++] = B;
                cal[idx++] = C;
                cal[idx++] = D;
                cal[idx++] = A + B;
                cal[idx++] = B + C;
                cal[idx++] = C + D;
                cal[idx++] = D + A;
                cal[idx++] = A + C;
                cal[idx++] = B + D;
                cal[idx++] = A + B + C;
                cal[idx++] = A + B + D;
                cal[idx++] = A + C + D;
                cal[idx++] = B + C + D;
                cal[idx++] = A + B + C + D;

                if(isEqualArray()){
                    System.out.print(A + " " + B + " " + C + " " + D);
                    return;
                }
            }
        }
        
        

        
    }
}