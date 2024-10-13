package day2_0828;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class pro181909 {
    public static String[] solution(String my_string) {

        List<String> listStr = new ArrayList<>();
        for (int i = my_string.length()-1; i >= 0; i--) {
            listStr.add(my_string.substring(i));
        }
        Collections.sort(listStr);
        String[] answer = new String[listStr.size()];
        for (int i = 0; i < listStr.size(); i++) {
            answer[i]=listStr.get(i);
        }
        return answer;
    }
    public static String[] solution1(String my_string) {
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            answer[i]=my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
        System.out.println(Arrays.toString(solution1("banana")));

    }
}
