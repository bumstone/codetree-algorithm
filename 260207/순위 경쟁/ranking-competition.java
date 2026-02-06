import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;

    public static int n;
    
    // 입력받은 학생 이름과 점수 변동값을 저장
    public static char[] name = new char[MAX_N];
    public static int[] value = new int[MAX_N];

    // 현재 A, B, C의 점수
    public static int scoreA = 0, scoreB = 0, scoreC = 0;

    public static int status(int score1, int score2, int score3) {
        if(score1 > score2 && score1 > score3)
            return 1;
        else if(score2 > score1 && score2 > score3)
            return 2;
        else if(score3 > score1 && score3 > score2)
            return 3;
        else if(score1 == score2 && score1 > score3)
            return 4;
        else if(score1 == score3 && score1 > score2)
            return 5;
        else if(score2 == score3 && score2 > score1)
            return 6;
        else return 7;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            name[i] = sc.next().charAt(0);
            value[i] = sc.nextInt();
        }

        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(name[i] == 'A') {
                if(status(scoreA, scoreB, scoreC) != status(scoreA + value[i], scoreB, scoreC))
                    ans++;
                scoreA += value[i];
            }
            else if(name[i] == 'B'){
                if(status(scoreA, scoreB, scoreC) != status(scoreA, scoreB + value[i], scoreC))
                    ans++;
                
                scoreB += value[i];
            } else{
                if(status(scoreA, scoreB, scoreC) != status(scoreA, scoreB, scoreC + value[i]))
                    ans++;
                scoreC += value[i];
            }
        }

        System.out.print(ans);
    }
}