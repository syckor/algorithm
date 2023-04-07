package string;

import java.util.Scanner;

public class Exam4 {
    public String solution(String[] str) {
        String answer = "";
        String temp = "";
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length();j++){
                temp = str[i].charAt(j) + temp;
            }
            answer += temp + "\n";
            temp = "";
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        String[] str = new String[input1];
        for(int i=0;i<input1;i++){
            str[i] = in.next();
        }
        Exam4 ex = new Exam4();
        System.out.println(ex.solution(str));
    }
}
