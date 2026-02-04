import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] seats = sc.next().toCharArray();
        
        int len = 0;
        int start = 0, end = 0;
        for(int i = 0; i < n; i++){
            if(seats[i] != '1') continue;
            for(int j = i + 1; j < n; j++){
                if(seats[j] == '1'){
                    if(len < j - i){
                        len = j - i;
                        start = i;
                        end = j;
                    }
                    i = j - 1;
                    break;
                }
            }
        }

        seats[(start + end) / 2] = '1';

        int ans = 999;
        for(int i = 0; i < n; i++){
            if(seats[i] != '1') continue;
            for(int j = i + 1; j < n; j++){
                if(seats[j] == '1'){
                    ans = Math.min(ans, j - i);
                    i = j - 1;
                    break;
                }
            }
            
        }

        System.out.print(ans);
    }
}