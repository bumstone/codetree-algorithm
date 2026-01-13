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
        for(int i = 1; i <= M; i++){
            boolean check1 = true;
            for(int j = 0; j < S; j++){
                boolean check2 = false;

                for(int k = 0; k < D; k++){
                    if(cheeses[k].m != i) continue;
                    if (sicks[j].p != cheeses[k].p) continue;
                    if (cheeses[k].t >= sicks[j].t) continue;

                    check2 = true;
                    break;
                }

                if(!check2){
                    check1 = false;
                    break;
                }
            }

            // i가 상한 치즈인 경우, 최대 사람 수 구하기
            if(check1){
                int[] persons = new int[N + 1];
                for(int j = 0; j < D; j++){
                    if(cheeses[j].m == i) persons[cheeses[j].p] = 1;
                }

                int cnt = 0;
                for(int j = 1; j <= N; j++){
                    if(persons[j] == 1) cnt++;
                }
                max = Math.max(max, cnt);
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