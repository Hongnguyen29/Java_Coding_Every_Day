package day1_0827;
//https://school.programmers.co.kr/learn/courses/30/lessons/181917

/*
boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때,
다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
(x1 ∨ x2) ∧ (x3 ∨ x4)
입출력 예
x1	     x2	     x3      x4    	result
false	true	true	true	true
true	false	false	false	false
 */
public class pro181917 {
    public static void main(String[] args) {

        boolean a = solution(true,false,false,false);
        System.out.println(a);

    }


    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
            return (x1||x2)&&(x3||x4);
    }


}
