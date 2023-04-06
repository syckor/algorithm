package string;

import java.util.Scanner;

public class Exam2 {
    public String solution(String str) {
        String answer = "";

        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))) answer += Character.toUpperCase(str.charAt(i));
            else answer += Character.toLowerCase(str.charAt(i));
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        Exam2 ex = new Exam2();
        System.out.println(ex.solution(input1));
    }
}
