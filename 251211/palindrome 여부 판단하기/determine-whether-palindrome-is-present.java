import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.

        if(isPalindrome(input)) System.out.println("Yes");
        else System.out.println("No");
    }

    public static boolean isPalindrome(String input){
        char tmp;
        int l = input.length();

        for(int i= 0; i< l / 2; i++){
            if(input.charAt(i) != input.charAt(l - i - 1)){
                return false;
            }
        }

        return true;
    }
}