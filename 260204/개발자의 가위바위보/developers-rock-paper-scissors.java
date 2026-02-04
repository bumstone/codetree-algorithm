import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] first = new int[n];
        int[] second = new int[n];
        for(int i = 0; i < n; i++){
            first[i] = sc.nextInt();
            second[i] = sc.nextInt();
        }
        
        int[][] permutations = {
            {1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}
        };


        int maxWins = 0;
        for (int[] p : permutations) {
            // p[0]=가위, p[1]=바위, p[2]=보
            int currentWins = 0;
            for (int i = 0; i < n; i++) {
                if ((first[i] == p[0] && second[i] == p[2]) || 
                    (first[i] == p[1] && second[i] == p[0]) || 
                    (first[i] == p[2] && second[i] == p[1])) {
                    currentWins++;
                }
            }
            maxWins = Math.max(maxWins, currentWins);
        }

        System.out.print(maxWins);
    }
}