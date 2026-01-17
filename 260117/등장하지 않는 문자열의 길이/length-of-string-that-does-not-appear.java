import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        
        int ans = Integer.MAX_VALUE;
        for(int end = 0; end < n; end++){
            String seg = str.substring(0, end + 1);
            int first = str.indexOf(seg);
            if(str.indexOf(seg, 1) == -1){
                ans = Math.min(ans, end + 1);
            }
        }


        System.out.print(ans);
    }
}