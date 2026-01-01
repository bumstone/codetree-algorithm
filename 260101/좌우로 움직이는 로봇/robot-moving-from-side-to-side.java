import java.util.Scanner;

public class Main {
    public static final int MAX = 1000001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int timeA = 1;
        int[] robotA = new int[MAX];
        int[] robotB = new int[MAX];
        
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            
            while(t-- > 0){
                if(d == 'R'){
                    robotA[timeA] = robotA[timeA - 1] + 1;
                } else {
                    robotA[timeA] = robotA[timeA - 1] - 1;
                }
                timeA++;
            }
        }
        
        int timeB = 1;
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            
            while(t-- > 0){
                if(d == 'R'){
                    robotB[timeB] = robotB[timeB - 1] + 1;
                } else {
                    robotB[timeB] = robotB[timeB - 1] - 1;
                }
                timeB++;
            }
        }

        int cnt = 0;

        if(timeA > timeB){
            for(int i = timeB; i < timeA - timeB; i++){
                robotB[i] = robotB[i -1];
            }

            for(int i = 1; i < timeA; i++){
                if((robotA[i] == robotB[i]) && (robotA[i-1] != robotB[i-1])){
                    cnt++;
                }
            }
        } else {
            for(int i = timeA; i < timeB - timeA; i++){
                robotA[i] = robotA[i-1];
            }

            for(int i = 1; i < timeB; i++){
                if((robotA[i] == robotB[i]) && (robotA[i-1] != robotB[i-1])){
                    cnt++;
                }
            }

        }
        
        System.out.println(cnt);
    }
}

