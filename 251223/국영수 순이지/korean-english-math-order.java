import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] korean = new int[n];
        int[] english = new int[n];
        int[] math = new int[n];

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            korean[i] = sc.nextInt();
            english[i] = sc.nextInt();
            math[i] = sc.nextInt();

            students[i] = new Student(names[i], korean[i], english[i], math[i]);
        }
        // Please write your code here.
        Arrays.sort(students, (a, b) -> {
            if(a.korean == b.korean){
                if(a.english == b.english) return b.math - a.math;
                return b.english - a.english;
            }
            return b.korean - a.korean;
        });

        for(int i = 0; i < n; i++){
            System.out.println(students[i].name + " " + students[i].korean + " " + students[i].english + " " + students[i].math);
        }
    }

    
}

class Student{
        String name;
        int korean;
        int english;
        int math;

        public Student(String name, int korean, int english, int math){
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }