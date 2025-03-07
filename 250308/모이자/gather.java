import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Please write your code here.
        int dist, answer = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            dist = 0;
            for(int j = 0; j < n; j++){
                dist += Math.abs(i - j) * a[j];
            }
            answer = Math.min(answer, dist);
        }
        System.out.println(answer);
    }
}