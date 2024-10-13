package day2_0828;

import java.util.Arrays;

public class pro181901 {
    public static int[] solution(int n, int k) {
        int count=0;
        for (int i = 1 ; i <= n ; i++) {
            if(i%k==0) count++;
        }
        int[] answer = new int[count];

        for (int i = 1,j=0; i <=n; i++) {
            if(i%k==0){ answer[j] =i;j++;}
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10,3)));
    }
}
