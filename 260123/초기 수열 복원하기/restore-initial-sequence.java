import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        for (int i = 0; i < n - 1; i++)
            a[i] = sc.nextInt();
        
        int[] origin = new int[n];
        for(int i = 1; i <= n; i++){
            int idx = 0;
            int[] counting = new int[n + 1];
            origin[idx++] = i;
            counting[i]++;

            boolean check = true;
            for(int j = 0; j < n - 1; j++){
                int diff = a[j] - origin[idx - 1];
                if (diff < 0 || diff > n) {
                    check = false;
                    break;
                }
                origin[idx++] = diff;
                counting[diff]++;
            }

            for(int j = 1; j <= n; j++){
                if(counting[j] > 1) {
                    check = false;
                    break;
                }
            }
            if(check) break;
        }

        for(int i = 0; i < n; i++)
            System.out.print(origin[i] + " ");
    }
}