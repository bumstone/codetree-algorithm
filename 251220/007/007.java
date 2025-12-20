import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        Mission m = new Mission(sCode, mPoint, time);

        System.out.println("secret code : " + m.sCode);
        System.out.println("meeting point : " + m.mPoint);
        System.out.println("time : " + time);
    }
}

class Mission{
    String sCode;
    char mPoint;
    int time;

    public Mission(String sCode, char mPoint, int time){
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }
}