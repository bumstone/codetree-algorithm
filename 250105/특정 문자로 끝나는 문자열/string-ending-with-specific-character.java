import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];
        for(int i =0; i < 10; i++){
            arr[i] = sc.nextLine();
        }

        char c = sc.next().charAt(0);

        int len;
        boolean check = false;
        for(int i =0; i < 10; i++){
            len = arr[i].length();
            if(arr[i].charAt(len - 1) == c) {
                System.out.println(arr[i]);
                check = true;
            }
        }

        if(!check) System.out.println("None");

    }
}