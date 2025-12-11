import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        int[] nums = {a, b};

        modify(nums);
        System.out.println(nums[0] + " " + nums[1]);
    }

    public static void modify(int[] nums) {
        int a = nums[0];
        int b = nums[1];

        if (a > b) {
            nums[0] = a + 25;
            nums[1] = b * 2;
        } else {
            nums[0] = a * 2;
            nums[1] = b + 25;
        }
    }
}