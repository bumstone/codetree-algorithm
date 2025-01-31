import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(season(y, m, d));

    }

    public static String season(int y, int m, int d){
        if (m < 1 || m > 12) {
            return "-1";
        }
        
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0){
            if (d < 1 || d > daysInMonth[m-1]) {
                return "-1";
            }
            if(3 <= m && m <= 5){
                return "Spring";
            } else if(6 <= m && m <= 8){
                return "Summer";
            } else if(9 <= m && m <= 11){
                return "Fall";
            } else {
                return "Winter";
            }
        } else {
            daysInMonth[1] = 28;
            if (d < 1 || d > daysInMonth[m-1]) {
                return "-1";
            }
            if(3 <= m && m <= 5){
                return "Spring";
            } else if(6 <= m && m <= 8){
                return "Summer";
            } else if(9 <= m && m <= 11){
                return "Fall";
            } else {
                return "Winter";
            }
        }
    }
}