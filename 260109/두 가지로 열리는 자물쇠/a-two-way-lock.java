import java.util.Scanner;

public class Main {
    public static int n;

    private static int normalizeValue(int value) {
        while(value > n) value -= n;
        while(value < 1) value += n;
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        
        int cnt = 250;
        if(n <= 5){
            cnt = n * n * n * 2;
            System.out.print(cnt);
            return;
        } 
        int overlap = 0;
        
        for(int i = -2; i <= 2; i++) {
            int normalizedA = normalizeValue(a + i);
            
            for(int j = -2; j <= 2; j++) {
                int normalizedB = normalizeValue(b + j);
                
                for(int k = -2; k <= 2; k++) {
                    int normalizedC = normalizeValue(c + k);
                    
                    for(int i2 = -2; i2 <= 2; i2++) {
                        if(normalizeValue(a2 + i2) == normalizedA) {
                            for(int j2 = -2; j2 <= 2; j2++) {
                                if(normalizeValue(b2 + j2) == normalizedB) {
                                    for(int k2 = -2; k2 <= 2; k2++) {
                                        if(normalizeValue(c2 + k2) == normalizedC) {
                                            overlap++;
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                }
            }
        }
        
        System.out.print(cnt - overlap);
    }
}