import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int max = Math.max(b, d);
        int min = Math.min(a, c);

        int area = 0;
        if(!(b < c || d < a)) area = max - min;
        else area = b - a + d - c;
        System.out.print(area);
    }
}