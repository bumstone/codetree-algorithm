import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();

            students[i] = new Student(i + 1, height, weight);
        }
        
        Arrays.sort(students, (a, b) -> {
            if(a.height == b.height){
                return b.weight - a.weight;
            }
            return a.height - b.height;
        });

        for(int i = 0; i < n; i++){
            System.out.println(students[i].height + " " + students[i].weight + " " + students[i].num);
        }
    }
    
}


class Student{
    int num;
    int height;
    int weight;

    public Student(int num, int height, int weight){
        this.num = num;
        this.height = height;
        this.weight = weight;
    }
}