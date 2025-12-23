import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        int[] weight = new int[n];

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();

            students[i] = new Student(i + 1, height[i], weight[i]);
        }
        
        Arrays.sort(students, (a, b) -> {
            if(a.height == b.height){
                if(a.num == b.num){
                    return a.num - b.num;
                }
                return b.weight - a.weight;
            }
            return b.height - a.height;
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