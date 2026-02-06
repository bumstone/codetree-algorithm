import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] board = new String[10];

        int xL = 0, yL = 0;
        int xB = 0, yB = 0;
        int xR = 0, yR = 0;
        for (int i = 0; i < 10; i++) {
            board[i] = sc.next();
            if(board[i].contains("B")){
                xB = i;
                yB = board[i].indexOf('B');
            } else if(board[i].contains("L")){
                xL = i;
                yL = board[i].indexOf('L');
            } else if(board[i].contains("R")){
                xR = i;
                yR = board[i].indexOf('R');
            }
        }
        int minDist = Math.abs(xL - xB) + Math.abs(yL - yB) - 1;

        if (xL == xB && xL == xR && Math.min(yL, yB) < yR && yR < Math.max(yL, yB)){
            minDist += 2;
        } else if(yL == yB && yL == yR && Math.min(xL, xB) < xR && xR < Math.max(xL, xB)){
            minDist += 2;
        }


        System.out.print(minDist);
    }
}