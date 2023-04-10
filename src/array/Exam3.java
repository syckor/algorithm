package array;

import java.util.Scanner;

public class Exam3 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] == arr2[i]){
                answer[i] = "D";
            }else if(arr1[i] > arr2[i]){
                if(arr2[i] == 1 && arr1[i] == 3) {answer[i] = "B";}
                else {answer[i] = "A";}
            }else if(arr1[i] < arr2[i]) {
                if(arr2[i] == 3 && arr1[i] == 1) {answer[i] = "A";}
                else {answer[i] = "B";}
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = in.nextInt();
        }
        Exam3 ex = new Exam3();
        for(String s : ex.solution(n, arr1, arr2)){
            System.out.println(s);
        }
    }
}
