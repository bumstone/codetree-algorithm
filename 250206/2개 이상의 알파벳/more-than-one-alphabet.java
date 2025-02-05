import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if(isDifferent(str)){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }

    public static boolean isDifferent(String str){
        // if(str.length() <= 1){
        //     return false;
        // }

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(i - 1)){
                return true;
            }
        }
        return false;
    }
}