import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int elapsed_time = 0;
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        if(m1 < m2 || (m1 == m2 && d1 <= d2)){
            while(!(m1 == m2 && d1 == d2)){
                elapsed_time++;
                d1++;

                if(num_of_days[m1] < d1){
                    d1 = 1;
                    m1++;
                    if (m1 > 12) m1 = 1;
                }
            }

            System.out.println(days[(elapsed_time + 1) % 7]);
        } else {
            while(!(m1 == m2 && d1 == d2)){
                elapsed_time++;
                d2++;

                if(num_of_days[m2] < d2){
                    d2 = 1;
                    m2++;
                    if (m2 > 12) m2 = 1;
                }
            }
            elapsed_time %= 7;
            if(elapsed_time > 1){
                System.out.println(days[(8 - elapsed_time)]);
            } else {
                System.out.println(days[(1 - elapsed_time)]);
            }

        }

    }
}