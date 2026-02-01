import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        
        String result = "nonintersecting";
        if(!(x1 > x4 || x2 < x3)) result = "intersecting";
        System.out.print(result);
    }
}