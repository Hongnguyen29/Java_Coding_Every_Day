package day1_0827;
//https://school.programmers.co.kr/learn/courses/30/lessons/181913
public class pro181913 {
    public static void main(String[] args) {
        System.out.println(solution("rermgorpsam",new int[][] {{2, 3}, {0, 7}, {5, 9}, {6, 10}}));
    }
    public static String solution(String my_string, int[][] queries) {
        String answer = "";
        for (int[] a : queries){
            String ab =new StringBuilder(my_string.substring(a[0],a[1]+1)).reverse().toString();
            my_string = my_string.substring(0,a[0])+ ab + my_string.substring(a[1]+1);
        }
        return my_string;
    }
}
