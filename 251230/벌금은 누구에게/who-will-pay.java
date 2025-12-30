import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        int[] save = new int[n + 1];
        for(int i = 1; i <= n; i++){
            save[i] = k;
        }

        int[] penalizedPerson = new int[m];
        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
        }
        
        int person = -1;
        for (int i = 0; i < m; i++) {
            person = penalizedPerson[i];
            save[person]--;
            if(save[person] <= 0) break;
        }

        System.out.println(person);

    }
}