import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int max = 0;
        for(int i = x; i <= y; i++) {
            int digitSum = String.valueOf(i)
                .chars()
                .map(Character::getNumericValue)
                .sum();
            max = Math.max(max, digitSum);
        }
        System.out.print(max);

    }
}