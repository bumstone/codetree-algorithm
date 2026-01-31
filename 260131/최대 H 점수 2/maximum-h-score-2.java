import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        
        int h = 0;
        for(int i = 0; i <= 100; i++){
            int cnt = 0;
            int lCnt = l;
            boolean check = true;
            for(int j = 0; j < n; j++){
                if(cnt >= i) break;
                if(lCnt > 0 && a[j] == i - 1){
                    lCnt--;
                    cnt++;
                }
                else if(a[j] >= i) cnt++;
            }

            if(cnt >= i) h = Math.max(h, i);
        }

        System.out.print(h);
    }
}