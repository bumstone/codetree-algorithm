import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str= sc.nextLine();
        String part = sc.nextLine();
        int cnt = 0;

        for(int i = 0; i < str.length() - 1; i = str.indexOf(part, i) + 1){
            if(str.indexOf(part, i) == -1){
                break;
            }
            cnt++;
        }

        System.out.print(cnt);
    }
}