import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();

            students[i] = new Student(name, score1, score2, score3);
        }
        // Please write your code here.
        Arrays.sort(students, (a, b) -> 
            (a.score1 + a.score2 + a.score3) - (b.score1 + b.score2 + b.score3)
        );
        
        for(int i=0; i < n; i++){
            System.out.println(students[i].name + " " + students[i].score1 + " " + students[i].score2 + " " + students[i].score3);
        }
        
    }
}

class Student{
    String name;
    int score1;
    int score2;
    int score3;

    public Student(String name, int score1, int score2, int score3){
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

}