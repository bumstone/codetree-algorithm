import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        boolean result = false;
        // x, x, x / x, x, y / x, y, y / y, y, y (기울기 같고 값이 같은 경우 스킵)
        for(int f = 0; f < 4; f++){
            for(int i = 0; i <= 10; i++){
                for(int j = 0; j <= 10; j++){
                    if(f != 2 && i == j) continue;
                    for(int k = 0; k <= 10; k++){
                        if((f == 0 || f == 3) && (i == k || j == k)) continue;
                        if(f == 2 && j == k) continue;

                        boolean check = true;
                        for(int l = 0; l < n; l++){
                            if(f == 0)
                                if(i != x[l] || j != x[l] || k != x[i]) check = false;
                            else if(f == 1)
                                if(i != x[l] || j != x[l] || k != y[i]) check = false;
                            else if(f == 2)
                                if(i != x[l] || j != y[l] || k != y[i]) check = false;
                            else
                                if(i != y[l] || j != y[l] || k != y[i]) check = false;
                        }

                        if(check){
                            result = true;
                            System.out.print(1);
                            return;
                        }
                    }
                }
            }
        }
        
        System.out.print(0);
    }
}