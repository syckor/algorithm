package string;


import java.util.Scanner;

public class Exam12 {
    public String solution(String str) {
        String answer = "";
        int ch = 0;
        int digit = 0;
        for(int i=0;i<str.length();i++){
            digit = str.charAt(i) == '#'?1:0;
            ch += Math.pow(2, (str.length()-1-i)%7)*digit;
            if((str.length()-1-i)%7 == 0){
                answer += (char)ch;
                ch = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        Exam12 ex = new Exam12();
        System.out.println(ex.solution(input1));
    }
}
