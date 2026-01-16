import java.util.Scanner;

public class Main {
    // 전역 변수로 설정
    public static String[] inp = new String[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            inp[i] = sc.next();
        }

        int ans = 0;
        for (int i = 1; i < 9; i++) {
            for (int j = i + 1; j <= 9; j++) {
                if (canWin(i, j)) {
                    ans++;
                }
            }
        }

        System.out.print(ans);
    }

    // 숫자 i와 j가 팀을 이루어 최소 한 라인이라도 승리할 수 있는지 체크
    public static boolean canWin(int i, int j) {
        // 1. 가로 3줄 체크
        for (int r = 0; r < 3; r++) {
            if (checkLine(r, 0, r, 1, r, 2, i, j)) return true;
        }

        // 2. 세로 3줄 체크
        for (int c = 0; c < 3; c++) {
            if (checkLine(0, c, 1, c, 2, c, i, j)) return true;
        }

        // 3. 우하향 대각 체크
        if (checkLine(0, 0, 1, 1, 2, 2, i, j)) return true;

        // 4. 우상향 대각 체크
        if (checkLine(0, 2, 1, 1, 2, 0, i, j)) return true;

        return false;
    }

    // 주어진 세 좌표의 값이 숫자 i와 j로만 구성
    // 두 숫자가 모두 최소 한 번씩 포함되었는지 확인
    public static boolean checkLine(int r1, int c1, int r2, int c2, int r3, int c3, int i, int j) {
        int[] vals = {
            inp[r1].charAt(c1) - '0',
            inp[r2].charAt(c2) - '0',
            inp[r3].charAt(c3) - '0'
        };

        boolean hasI = false;
        boolean hasJ = false;

        for (int v : vals) {
            if (v == i) hasI = true;
            else if (v == j) hasJ = true;
            else return false;
        }

        return hasI && hasJ;
    }
}