import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int current= 100 * n;
        final int MAX = 200 * n + 1;
        int[] cntW = new int[MAX];
        int[] cntB = new int[MAX];
        int[] color = new int[MAX];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d == 'R'){
                while(x-- > 0){
                    color[current] = 2;
                    if(x > 0) current++;
                }
            } else if(d == 'L'){
                while(x-- > 0){
                    color[current] = 1; 
                    if(x > 0) current--;
                }
            }
        }

        int whiteCnt = 0;
        int blackCnt = 0;
        for(int c : color){
            if(c==1) whiteCnt++;
            else if(c==2) blackCnt++;
        }
        

        System.out.println(whiteCnt + " " + blackCnt);
    }
}