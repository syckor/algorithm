package string;

import java.sql.Timestamp;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exam8 {
    public String solution(String str) {
        String answer = "NO";
        str = str.replaceAll("[^A-Za-z]","").toUpperCase();

        String rstr = new StringBuilder(str).reverse().toString();
        if(str.equals(rstr)) return "YES";

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        Exam8 ex = new Exam8();
        System.out.println(ex.solution(input1));
    }
}
