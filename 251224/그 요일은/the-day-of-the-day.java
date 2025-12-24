import java.util.Scanner;

public class Main {
    static int[] num_of_days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static int dayOfYear(int m, int d) {
        int sum = 0;
        for (int i = 1; i < m; i++){
            sum += num_of_days[i];
        }
        return sum + d;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.
        int day1 = dayOfYear(m1, d1);
        int day2 = dayOfYear(m2, d2);

        int dayIndex = -1;
        for (int i = 0; i < 7; i++) {
            if(days[i].equals(A)){
                dayIndex = i;
                break;
            }
        }

        int cnt = 0;

        if(day1 <= day2){
            int diff = day2 - day1 + 1; 
            cnt = diff / 7;
            cnt += (diff % 7 > dayIndex) ? 1 : 0;
            System.out.println(cnt);
        }
        else {
            int diff = day1 - day2 + 1;
            cnt = diff / 7;
            cnt += (7 - diff % 7 > dayIndex) ? 1 : 0;
            System.out.println(cnt);
        }

    }
}