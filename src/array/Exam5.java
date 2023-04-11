package array;
import java.util.Scanner;

public class Exam5 {
    public int solution(int n) {
        int answer = 0;

        int[] che = new int[n+1];
        for(int i=2;i<=n;i++){
            if(che[i] == 0) {
                answer+=1;
                for(int j=i;j<=n;j=j+i){
                    che[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Exam5 ex = new Exam5();
        System.out.println(ex.solution(n));
    }
}
