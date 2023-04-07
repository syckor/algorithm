package string;

import java.util.Scanner;

public class Exam6 {
    public String solution(String str) {
        String answer = "";
        for(int i=0;i<str.length();i++){
            if(!answer.contains(String.valueOf(str.charAt(i)))) answer +=str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        Exam6 ex = new Exam6();
        System.out.println(ex.solution(input1));
    }
}
