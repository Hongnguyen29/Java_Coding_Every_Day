package day2_0828;

import java.util.Arrays;

public class pro181900 {
    public static String solution(String my_string, int[] indices) { //mat nhieu time
        String answer = "";
        Arrays.sort(indices);
        for (int i = 0; i < my_string.length(); i++) {
            if(!(Arrays.binarySearch(indices,i) >=0)){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
    public static String solution1(String my_string, int[] indices) {
        String answer = "";
        String[] str = my_string.split("");
        for (int x : indices){
            str[x] ="";
        }
       /* for (int i = 0; i < str.length; i++) {
            answer += str[i];
        }*/
        for(String y : str){
            answer +=y;
        }

        return answer;
    }
}
