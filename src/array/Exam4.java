package array;

import java.util.Scanner;

public class Exam4 {
    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for(int i=2;i<n;i++){
            answer[i] = answer[i-1] +answer[i-2];
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Exam4 ex = new Exam4();
        for(int s : ex.solution(n)){
            System.out.print(s + " ");
        }
    }
}
