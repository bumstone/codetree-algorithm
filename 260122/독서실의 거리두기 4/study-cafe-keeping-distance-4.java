import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] seat = sc.next().toCharArray();
        
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(seat[i] == '1') continue;
            for(int j = i + 1; j < n; j++){
                if(seat[j] == '1') continue;
                int cnt = 0;
                int min = 100;
                seat[i] = '1';
                seat[j] = '1';

                for(int k = 0; k < n; k++){
                    if(seat[k] == '1'){
                        boolean foundNext = false;
                        for(int l = k + 1; l < n; l++){
                            cnt++;
                            if(seat[l] == '1'){
                                foundNext = true;
                                k = l - 1;
                                break;
                            }
                        }
                        if(foundNext){
                            min = Math.min(min, cnt);
                            cnt = 0;
                        }
                    }
                }

                ans = Math.max(ans, min);
                seat[i] = '0';
                seat[j] = '0';
            }
            
        }

        System.out.print(ans);
    }
}