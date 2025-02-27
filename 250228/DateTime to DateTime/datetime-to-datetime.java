import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int elapsed_time = 0;
        int day = 11, hour = 11, min = 11;

        // while(true){
        //     if(day == A && hour == B && min == C){
        //         break;
        //     }

        //     elapsed_time++;
        //     min++;

        //     if(min == 60){
        //         min = 0;
        //         hour++;
        //     }
        //     if(hour==24){
        //         hour = 0;
        //         day++;
        //     }
        // }
        elapsed_time += (A - 11) * 24 * 60 + (B - 11) * 60 + (C - min);
        
        if (elapsed_time < 0) {
            System.out.println(-1);
        } else {
            System.out.println(elapsed_time);
        }
    }
}