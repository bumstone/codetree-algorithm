import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.
        Character c = new Character("codetree", 10);
        Character d = new Character(id, level);

        System.out.println("user " + c.id + " lv " + c.level);
        System.out.println("user " + d.id + " lv " + d.level);  
    }
}

class Character{
    String id;
    int level;
    
    public Character(String id, int level){
        this.id = id;
        this.level = level;
    }
}