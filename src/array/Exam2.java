package array;

import java.util.Scanner;

public class Exam2 {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max) {
                answer+=1;
                max = arr[i];
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
        Exam2 ex = new Exam2();
        System.out.println(ex.solution(n, arr));
    }
}
