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
            int blocks_n = 0;
            for (int j = s[i]; j <= e[i]; j++) {
                if(blocks[j + blocks_n] == 0){
                    blocks_n++;
                    j--;
                    continue;
                }
                blocks[j + blocks_n] = 0;
                L--;
            }
        }

        int[] arr = new int[L];
        int cnt = 0;
        for (int j = 0; j < n; j++) {
            if (blocks[j] != 0) {
                arr[cnt++] = blocks[j];
            }
        }

        System.out.println(L);
        for(int num : arr){
            System.out.println(num);
        }


    }
}