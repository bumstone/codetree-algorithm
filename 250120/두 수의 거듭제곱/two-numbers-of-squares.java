import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        printSquare(a, b);

    }

    public static void printSquare(int a, int b){
        int square = 1;

        for(int i = 0; i < b; i++){
            square *= a;
        }

        System.out.println(square);
    }
}