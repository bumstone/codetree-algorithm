import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int min = 10000;
        for(int i = 1; i <= 5000; i++){
            int x = i;
            boolean check = true;
            for(int j = 0; j < n; j++){
                x *= 2;
                if(a[j] > x || b[j] < x){
                    check = false;
                    break;
                } 
            }
            if(check) min = i;
        }

        System.out.print(min);
    }
}