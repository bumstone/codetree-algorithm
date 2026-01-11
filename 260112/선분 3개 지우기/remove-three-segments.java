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
        
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+ 1; j < n; j++){
                if(i == j) continue;
                for(int k = j + 1; k < n; k++){
                    if(i == k || j == k) continue;
                    int[] counting = new int[101];
                    boolean check = true;
                    for(int l = 0; l < n; l++){
                        if(l == i || l == j || l == k) continue;

                        for(int m = a[l]; m <= b[l]; m++){
                            counting[m]++;
                            if(counting[m] > 1) check = false;
                        }
                    }
                    
                    if(check) cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}