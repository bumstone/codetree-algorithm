import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        while(!str.equals("END")){
            System.out.println(new StringBuilder(str).reverse());
            str = sc.nextLine();
        }
    }
}