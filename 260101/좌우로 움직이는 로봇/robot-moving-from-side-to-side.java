import java.util.Scanner;

public class Main {
    public static final int MAX = 1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sumTime = 1;
        int[] robotA = new int[MAX];
        int[] robotB = new int[MAX];
        
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            
            while(t-- > 0){
                if(d == 'R'){
                    robotA[sumTime] = robotA[sumTime - 1] + 1;
                    sumTime++;
                } else {
                    robotA[sumTime] = robotA[sumTime - 1] - 1;
                    sumTime++;
                }
            }
        }
        
        sumTime = 1;
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            
            while(t-- > 0){
                if(d == 'R'){
                    robotB[sumTime] = robotB[sumTime - 1] + 1;
                    sumTime++;
                } else {
                    robotB[sumTime] = robotB[sumTime - 1] - 1;
                    sumTime++;
                }
            }
        }
        
        int cnt = 0;
        for(int i = 1; i <= sumTime; i++){
            if((robotA[i] == robotB[i]) && (robotA[i-1] != robotB[i-1])){

                cnt++;
            }
        }

        System.out.println(cnt);
    }
}

