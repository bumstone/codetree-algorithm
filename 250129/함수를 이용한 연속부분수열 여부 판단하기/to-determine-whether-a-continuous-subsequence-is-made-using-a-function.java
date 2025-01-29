import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] A = new int[n1];
        int[] B = new int[n2];

        for(int i = 0; i < n1; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < n2; i++){
            B[i] = sc.nextInt();
        }

        if(isSequence(A, B)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }

    public static boolean isSequence(int[] A, int[] B){
        if(B.length > A.length){
            return false;
        }

        for(int i = 0; i <= A.length - B.length; i++){
            boolean found = true;
            for(int j = 0; j < B.length; j++){
                if(A[i + j] != B[j]){
                    found = false;
                    break;
                }
            }
            if(found){
                return true;
            }
        }
        return false;
    }
}