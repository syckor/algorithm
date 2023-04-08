package string;

import java.util.Scanner;

public class Exam9 {
    public int solution(String str) {
        String nums = "";
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))) nums += str.charAt(i);
        }

        return Integer.parseInt(nums);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        Exam9 ex = new Exam9();
        System.out.println(ex.solution(input1));
    }
}
