import java.util.Scanner;
public class Main {
    public static int n, m;
    public static final int MAX_N = 100;
    public static int[] nums = new int[MAX_N];

    public static boolean canDivide(int limit){
        int count = 1; // 구간의 개수
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            if (sum + nums[i] > limit) {
                count++;       // 새로운 구간 시작
                sum = nums[i]; // 현재 값을 새 구간의 시작으로
            } else {
                sum += nums[i];
            }
        }
        
        return count <= m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int low = 0, high = 0;
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();

            low = Math.min(low, nums[i]);
            high += nums[i];
        }
            
        int min = high;
        while(low <= high){
            int mid = (low + high) / 2;

            if(canDivide(mid)){
                min=mid;
                high = mid -1;
            }
            else low = mid + 1;
        }

        System.out.print(min);
    }
}