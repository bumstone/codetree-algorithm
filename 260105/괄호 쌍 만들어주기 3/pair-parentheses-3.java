import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] brackets = sc.next().toCharArray();

        int count = 0;
        for(int i = 0; i < brackets.length; i++){
            for(int j = i + 1; j < brackets.length; j++){
                if(brackets[i] == '(' && brackets[j] == ')') count++;
            }
        }
        System.out.print(count);
    }
}