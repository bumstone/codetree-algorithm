import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int current = 10 * n;
        int[] h = new int[20 * n + 1];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.
            if(dir == 'R'){
                for(int j = current; j < current + x; j++){
                    h[j]++;
                }
                current += x;
            } else if(dir == 'L'){
                for(int j = current - x; j < current; j++){
                    h[j]++;
                }
                current -= x;
            }

        }
        int answer = 0;
        for(int i = 0; i < h.length; i++){
            if(h[i] >= 2){
                answer++;
            }
        }

        System.out.print(answer);
    }
}