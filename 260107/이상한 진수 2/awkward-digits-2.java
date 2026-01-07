import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();

        boolean one = false;
        for(int i = 1; i < a.length; i++){
            if(a[i] == '0'){
                a[i] = '1';
                one = true;
                break;
            }
        }

        if(!one) {
            a[a.length - 1] = 0;
        }

        int N = 0;
        for(int i = 0; i < a.length; i++){
            N = N * 2 + (a[i] - '0');
            System.out.println(a[i]);
        }
        System.out.print(N);
    }
}