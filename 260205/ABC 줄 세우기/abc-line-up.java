import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next().charAt(0));
        }
        
        int minChange = 0;
        for(int i =0; i < n; i++){
            int index = list.indexOf((char)('A' + i));
            if(index != i){
                minChange += index - i;

                list.remove(index);
                list.add(i, (char)('A' + i));
            }
        }
        
        System.out.print(minChange);
    }
}