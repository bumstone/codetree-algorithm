import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
        }
        int[] s = new int[2];
        int[] e = new int[2];
        for(int i = 0; i < 2; i++){
            s[i] = sc.nextInt() - 1;
            e[i] = sc.nextInt() - 1;
        }

        // Please write your code here.
        int L = n;
        
        for (int i = 0; i < 2; i++) {
            int start = s[i];
            int end = e[i];

            if (start >= L) continue;
            if (end >= L) end = L - 1;

            int[] temp = new int[L - (end - start + 1)];
            int idx = 0;
            for (int j = 0; j < L; j++) {
                if (j < start || j > end) {
                    temp[idx++] = blocks[j];
                }
            }
            blocks = temp;
            L = temp.length;

            if (L == 0) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(L);
        for(int num : blocks){
            System.out.println(num);
        }


    }
}