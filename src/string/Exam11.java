package string;


import java.util.Scanner;

public class Exam11 {
    public String solution(String str) {
        String answer = "";
        char ch = '0';
        char target = '0';
        int num = 1;
        for(int i=0;i<str.length();i++){
            target = str.charAt(i);
            if(ch == target){
                num += 1;
            }else{
                if(num > 1) answer += num;
                num = 1;
                answer += target;
                ch = target;
            }
        }
        if(num > 1 ) answer += num;
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        Exam11 ex = new Exam11();
        System.out.println(ex.solution(input1));
    }
}
