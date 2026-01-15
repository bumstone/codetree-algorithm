import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        
        int max = 0;
        for(int i = 1; i <= 3; i++){
            int num = i, cnt = 0;
            for(int j = 0; j < n; j++){
                if(num == a[j]) num = b[j];
                else if(num == b[j]) num = a[j];
                if(num == c[j]) cnt++;
            }
            max = Math.max(max, cnt);
        }

        System.out.print(max);
    }
}
