import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        if(o == '+'){
            printPlus(a, o, c);
        } else if(o == '-'){
            printMinus(a, o, c);
        } else if(o=='*'){
            printMul(a, o, c);
        } else if(o=='/'){
            printDiv(a, o, c);
        } else {
            System.out.println("False");
        }
    }

    public static void printPlus(int a, char o, int c){
        int sum = a + c;
        System.out.println(a + " " + o + " " + c + " = " + sum);
    }

    public static void printMinus(int a, char o, int c){
        int sum = a - c;


        System.out.println(a + " " + o + " " + c + " = " + sum);
    }

    public static void printMul(int a, char o, int c){
        int sum = a * c;


        System.out.println(a + " " + o + " " + c + " = " + sum);
    }

    public static void printDiv(int a, char o, int c){
        int sum = a / c;


        System.out.println(a + " " + o + " " + c + " = " + sum);
    }
}