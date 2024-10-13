package day2_0828;
//https://school.programmers.co.kr/learn/courses/30/lessons/181911
public class pro181911 {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for (int i = 0; i < my_strings.length; i++) {
            answer += my_strings[i].substring(parts[i][0],parts[i][1]);
        }
        return answer;
    }
    public String solution1(String[] my_strings, int[][] parts) {

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++) {
            answer.append(my_strings[i].substring(parts[i][0], parts[i][1]+1));
        }
        return answer.toString();
    }
}
