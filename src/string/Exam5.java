package string;

import java.io.CharConversionException;
import java.util.Scanner;

public class Exam5 {
    public String solution(String str) {
        String answer = "";
        char[] chs = str.toCharArray();
        int lt = 0, rt = chs.length-1;
        while(lt < rt){
            if(!Character.isAlphabetic(chs[lt])) {lt ++; continue;}
            if(!Character.isAlphabetic(chs[rt])) { rt --; continue;}
            char temp = chs[lt];
            chs[lt] = chs[rt];
            chs[rt] = temp;
            lt++; rt--;
        }
        return String.valueOf(chs);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        Exam5 ex = new Exam5();
        System.out.println(ex.solution(input1));
    }
}
