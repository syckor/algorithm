package array;
import java.util.Scanner;

public class Exam6 {
    public String solution(int n, int[] arr) {
        String answer = "";
        for(int i=0;i<arr.length;i++){
            int target = Integer.parseInt(new StringBuilder(Integer.toString(arr[i])).reverse().toString());
            System.out.println("target : " + target);
            for(int j=1;j<=target/2;j++){
                if(target%j==0 && j != 1){
                    System.out.println(target + " " + j);
                    break;
                }
                if(j==target/2) answer += target + " ";
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
        Exam6 ex = new Exam6();
        System.out.println(ex.solution(n, arr));
    }
}
