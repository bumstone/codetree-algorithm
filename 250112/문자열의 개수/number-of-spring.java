import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        List<String> list = new ArrayList<>();
        while(!str.equals("0")){
           list.add(str);
           str = sc.nextLine();
       }

        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            if(i % 2 == 0){
                System.out.println(list.get(i));
            }
        }
    }
}