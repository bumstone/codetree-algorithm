import java.util.Scanner;
public class Main {
    public static final int MAX_NUM = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1) {
            System.out.print(0);
            return;
        }
        int[] arr = new int[MAX_NUM + 1];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            
            if(c == 'G') {
                arr[x] = 1;
            } else {
                arr[x] = 2;
            }
        }



        int maxSize = 0;
        for(int i = 0; i <= MAX_NUM; i++) {
            if(arr[i] == 0) continue;
            int size = 0;
            int gCnt = 0, hCnt = 0;
            for(int j = i; j <= MAX_NUM; j++) {
                if(arr[j] == 1){
                    gCnt++;

                } else if(arr[j] == 2){
                    hCnt++;
                } else continue;

                if(gCnt > 0 && hCnt > 0 && gCnt == hCnt) {
                    size = j - i;
                }
            }
            maxSize = Math.max(maxSize, size);
        }
        
        System.out.println(maxSize);
    }
}