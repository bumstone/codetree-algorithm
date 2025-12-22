import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = 0;
        FutureDate[] futureRainyDates = new FutureDate[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.

            if(weather.equals("Rain")){
                futureRainyDates[idx++] = new FutureDate(date, day, weather);
            }
        }

        
        if(futureRainyDates.length >= 1) 
            System.out.println(futureRainyDates[0].date + " " + futureRainyDates[0].day + " " + futureRainyDates[0].weather);
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