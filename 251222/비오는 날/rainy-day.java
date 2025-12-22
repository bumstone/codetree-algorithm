import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = 0;
        FutureDate earliestRain = null;

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.

            if (weather.equals("Rain")) {
                FutureDate cur = new FutureDate(date, day, weather);

                if (earliestRain == null || cur.date.compareTo(earliestRain.date) < 0) {
                    earliestRain = cur;
                }
            }
        }

        if (earliestRain != null) 
            System.out.println(earliestRain.date + " " + earliestRain.day + " " + earliestRain.weather);

    }
}

class FutureDate{
    String date;
    String day;
    String weather;

    public FutureDate(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

}