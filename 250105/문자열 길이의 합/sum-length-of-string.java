import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] strArray = new String[n];

        for(int i = 0; i < n; i++){
            strArray[i] = sc.nextLine();
        }

        int arraySum = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++){
            arraySum += strArray[i].length();
            if(strArray[i].charAt(0) == 'a'){
                cnt++;
            }
        }
        System.out.println(arraySum + " " + cnt);
    }
}