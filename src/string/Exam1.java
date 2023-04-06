package string;

import java.util.Scanner;

public class Exam1 {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == t) answer+=1;
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);
        Exam1 ex = new Exam1();
        System.out.println(ex.solution(input1, input2));
    }
}
