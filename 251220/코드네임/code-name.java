import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.

        CodeName[] codeNames = new CodeName[5];
        for(int i = 0; i < 5; i++) {
            String code = sc.next();
            int point = sc.nextInt();
            codeNames[i] = new CodeName(code, point);
        }

        Arrays.sort(codeNames, (a, b) -> a.point - b.point);

        CodeName last = codeNames[0];
        System.out.print(last.code + " ");
        System.out.print(last.point);
    }
}

class CodeName {
    String code;
    int point;

    public CodeName(String code, int point){
        this.code = code;
        this.point = point;
    }

    
};

