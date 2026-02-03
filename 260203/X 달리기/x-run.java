import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int speed = 1;
        int sum = 0;
        int sec = 0;

        while(true){
            if(sum > x/2) break;
            sum += speed++;
            sec++;
        }
        speed--;
        while(true){
            if(sum > x) break;
            sum += --speed;
            sec++;
        }


        System.out.print(sec);
    }
}