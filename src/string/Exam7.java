package string;

import java.util.Scanner;

public class Exam7 {
    public String solution(String str) {
        String answer = "";
        int lt = 0, rt = str.length()-1;
        boolean boo = true;
        while(lt < rt){
            if(Character.toUpperCase(str.charAt(lt)) != Character.toUpperCase(str.charAt(rt))) {
                boo = false;
                break;
            }
            lt++; rt--;
        }
        answer = boo?"YES":"NO";
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        Exam7 ex = new Exam7();
        System.out.println(ex.solution(input1));
    }
}
