import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        StringBuilder num1 = new StringBuilder();
        for(char c : str1.toCharArray()) {
            if(c >= '0' && c <= '9') {
                num1.append(c);
            } else {
                break;
            }
        }

        StringBuilder num2 = new StringBuilder();
        for(char c : str2.toCharArray()) {
            if(c >= '0' && c <= '9') {
                num2.append(c);
            } else {
                break;
            }
        }

        System.out.print(Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString()));

    }
}