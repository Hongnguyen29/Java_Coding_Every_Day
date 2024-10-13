package day1_0827;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/181912
public class pro181912 {
    public static int[] solution(String[] intStrs, int k, int s, int l) {
        int count =0;
        for (String a : intStrs){
            int re = Integer.parseInt(a.substring(s,s+l));
            if(re>k){
                count++;
            }
        }
        int[] answer = new int[count];
        int index =0;
        for (String a : intStrs){
            int re = Integer.parseInt(a.substring(s,s+l));
            if(re>k){
                answer[index] = re;
                index++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[] {"0123456789","9876543210","9999999999999"},	50000,5,5)));
    }
}
