package string;

import java.util.Arrays;
import java.util.Scanner;

public class Exam10 {
    public String solution(String str) {
        String answer = "";
        String ch = str.split(" ")[1];
        str = str.split(" ")[0];
        int dist = 1000;
        int[] distances = new int[str.length()];
        for(int i=0;i<str.length();i++){
            if(ch.equals(Character.toString(str.charAt(i)))){
                dist = 0;
                distances[i] = dist;
            } else {
                dist+=1;
                distances[i] = dist;
            }
        }

        dist = 1000;
        for(int i=distances.length-1;i>=0;i--){
            if(distances[i] == 0 ) {
                dist = 1;continue;
            }
            if(dist < distances[i]) {
                distances[i] = dist;
                dist++;
            }
        }
        answer = Arrays.toString(distances).replaceAll("[^0-9 ]","");
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        Exam10 ex = new Exam10();
        System.out.println(ex.solution(input1));
    }
}
