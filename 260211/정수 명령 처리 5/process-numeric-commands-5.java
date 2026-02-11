import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String command = sc.next();
            if(command.equals("push_back"))
                nums.add(sc.nextInt());
            if(command.equals("pop_back"))
                nums.remove(nums.size() - 1);
            if(command.equals("size"))
                System.out.println(nums.size());
            if(command.equals("get"))
                System.out.println(nums.get(sc.nextInt() - 1));
        }
        
        

    }
}