package string;

import java.util.Scanner;

public class Exam3 {
    public String solution(String str) {
        String answer = "";
        String[] arr = str.split(" ");
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length() > max) {
                System.out.println(i);
                max =arr[i].length();
                answer = arr[i];
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        Exam3 ex = new Exam3();
        System.out.println(ex.solution(input1));
    }
}
