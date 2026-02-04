import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int minMovement = 0;
        while(true){
            if(a + 1 == b && a + 2 == c) break;
            if((Math.abs(b - a) > Math.abs(c - b) && Math.abs(c - b) != 1) || Math.abs(b - a) == 1){
                a = b;
                b = (b + c + 1) / 2;
            } else if((Math.abs(b - a) <= Math.abs(c - b) && Math.abs(b - a) != 1) || Math.abs(c - b) == 1){
                c = b;
                b = (a + b + 1) / 2;
            }

            minMovement++;
        }


        System.out.print(minMovement);
    }
}