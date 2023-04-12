package array;
import java.util.Scanner;

public class Exam7 {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int score = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                score = 0;
            }else{
                score+=1;
                answer += score;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Exam7 ex = new Exam7();
        System.out.println(ex.solution(n, arr));
    }
}
