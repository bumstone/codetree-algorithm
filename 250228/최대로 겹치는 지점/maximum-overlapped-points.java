import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];

        int[] h = new int[101];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();

            for(int x = start[i]; x <= end[i]; x++){
                h[x]++;
            }
        }
        // Please write your code here.
        int answer = 1;
        for(int i =0; i < h.length; i++){
            if(h[i] == 1){
                answer++;
            }
        }

        System.out.print(answer);
    }
}