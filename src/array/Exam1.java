package array;

import java.util.Scanner;

public class Exam1 {
    public String solution(int n, int[] arr) {
        String answer = "";
        answer =arr[0]+ " ";
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[i-1]) answer += arr[i] + " ";
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
        Exam1 ex = new Exam1();
        System.out.println(ex.solution(n, arr));
    }
}
