import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b= new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0; i < m; i++){
            int cnt = 1;
            for(int j = i + 1; j < m; j++){
                if(a[i] == a[j] && b[i] == b[j]) cnt++;
                else if(a[i] == b[j] && b[i] == a[j]) cnt++;
            }
            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}