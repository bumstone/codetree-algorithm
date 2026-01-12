import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 사람의 수
        int M = sc.nextInt();   // 치즈의 수
        int D = sc.nextInt();   // 치즈를 먹은 기록의 수
        int S = sc.nextInt();   // 아픈 기록의 수(상한 치즈 먹은 후 최소 1초 뒤 증상, 기록 외의 환자 존재)

        CheeseRecord[] cheeses = new CheeseRecord[D];
        for (int i = 0; i < D; i++) {
            int p = sc.nextInt();   // 먹은 사람 번호
            int m = sc.nextInt();   // 먹은 치즈 번호
            int t = sc.nextInt();   // 먹은 시간
            cheeses[i] = new CheeseRecord(p, m, t);
        }
        SickRecord[] sicks = new SickRecord[S];
        for (int i = 0; i < S; i++) {
            int p = sc.nextInt();   // 아픈 사람 번호
            int t = sc.nextInt();   // 아픈 시간
            sicks[i] = new SickRecord(p, t);
        }
        int max = 0;
        for(int i = 0; i < S; i++){
            for(int j = 0; j < D; j++){
                // 아픈 사람 번호와 일치하면서 아픈 시간 이전에 치즈를 먹은 경우만 확인
                if(sicks[i].p != cheeses[j].p || sicks[i].t < cheeses[j].t) continue;
                int count = 1;
                for(int k = 0; k < D; k++){
                    // 같은 번호의 사람이 아니면서 동시에 같은 번호의 치즈를 먹은 사람의 경우
                    if(cheeses[j].p == cheeses[k].p || cheeses[j].m != cheeses[k].m) continue;
                    count++;
                }
                max = Math.max(max, count);
            }
        }

        System.out.print(max);
    }
}

class CheeseRecord{
    int p;
    int m;
    int t;

    public CheeseRecord(int p, int m, int t){
        this.p = p;
        this.m = m;
        this.t = t;
    }
}

class SickRecord{
    int p;
    int t;

    public SickRecord(int p, int t){
        this.p = p;
        this.t = t;
    }
}