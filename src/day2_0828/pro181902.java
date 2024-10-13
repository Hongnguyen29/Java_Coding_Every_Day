package day2_0828;

import java.util.Arrays;

public class pro181902 {
    public static int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i<52 ; i++){
            for (char x : my_string.toCharArray()){
               if(x > 64 && x < 91 && x - 65 == i){
                   answer[i]++;
               }
               else if(x>96 && x < 123 && x-71 ==i){
                   answer[i]++;
               }
            }
        }
        return answer;
    }
    public static int[] solution1(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i<my_string.length() ; i++){
            char x = my_string.charAt(i);

            if(x > 64 && x < 91) answer[x-65]++;
            else if(x>96 && x < 123)
                    answer[x-71]++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("Programmers")));
        System.out.println(Arrays.toString(solution1("Programmers")));

    }
}
