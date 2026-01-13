import java.util.Scanner;

public class Main {

    public static boolean interestNum(int n){
        int[] counting = new int[10];
        while(n > 0){
            counting[n % 10]++;
            n /= 10;
        }
        int cnt = 0;
        boolean check = false;
        for(int i = 0; i < 10; i++){
            if(counting[i] > 0) {
                cnt++;
                if(counting[i] == 1) check = true;
            }
        }

        return cnt == 2 && check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int cnt = 0;
        for(int i = x; i <= y; i++){
            if(interestNum(i)) cnt++;
        }

        System.out.print(cnt);
    }
}