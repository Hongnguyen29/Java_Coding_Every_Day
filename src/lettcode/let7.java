package lettcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class let7 {
    public static List<String> summaryRanges(int[] nums) { //time run error
        List<String> answer = new ArrayList<>();
        int first = nums[0];
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] - last == 1) {
                last = nums[i];
            }
            else {
            String a =( first == last )? String.valueOf(first) : first +"->"+last;
            answer.add(a);
            first = nums[i];
            last = nums[i];}
        }
        String a =( first == last )? String.valueOf(first) : first +"->"+last;
        answer.add(a);
        return answer;
    }
    public static List<String> summaryRanges1(int[] nums) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int first = nums[0];
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] - last == 1) {
                last = nums[i];
            }
            else {
                if(first == last){
                    sb.append(first);
                }
                else{ sb.append(first).append("->").append(last);
                answer.add(sb.toString());}
                first = nums[i];
                last = nums[i];}
        }
        if(first == last){
            sb.append(first);
        }
        else {sb.append(first).append("->").append(last);
        answer.add(sb.toString());}
        return answer;
    }

    private static List<String> add (List<String >a,int first,int last){
        String ax =( first == last )? String.valueOf(first) : first +"->"+last;
         a.add(ax);
         return  a;
    }
    public List<String> summaryRanges3(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;
        int j = 0;
        if (n == 0) {
            return result;
        }
        for (int i = 0; i < n; i++) {
            j = i;
            while (i + 1 < n && nums[i] + 1 == nums[i + 1]) {
                i++;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(nums[j]);
            if (i > j) {
                sb.append("->").append(nums[i]);
            }
            result.add(sb.toString());
        }
        return result;
    }
    public static List<String> summaryRangesOk(int[] nums) { //time run error
        List<String> answer = new ArrayList<>();
        int start = 0;
        int end=0 ;
        for (int i = start; i < nums.length; i++) {
            StringBuilder str = new StringBuilder();
            str.append((nums[start]));
            end = start;
            while (i+1< nums.length && nums[i+1]==nums[i]+1){
                i++;
                end=i;
            }
            if(end > start){
                str.append("->").append(nums[end]);
                start = end + 1;
            }
            start = end +1;
            answer.add(str.toString());
        }
        return answer;
    }
    public List<String> summaryRanges5(int[] nums) {
        List<String> ranges = new ArrayList<>();

        if (nums.length == 0) {
            return ranges;
        }

        int i = 0;

        int firstNum = nums[0];
        int lastNum = nums[0];
        StringBuilder sb = new StringBuilder();
        while (i < nums.length - 1) {
            if (nums[i + 1] != nums[i] + 1) {
                if (firstNum == lastNum) {
                    sb.append(firstNum);
                } else {
                    sb.append(firstNum).append("->").append(lastNum);
                }
                ranges.add(sb.toString());
                firstNum = nums[i + 1];
                sb = new StringBuilder();
            }

            lastNum = nums[i + 1];
            i++;
        }

        if (firstNum == lastNum) {
            sb.append(firstNum);
        } else {
            sb.append(firstNum).append("->").append(lastNum);
        }
        ranges.add(sb.toString());

        return ranges;
    }




    public static void main(String[] args) {
        System.out.println(summaryRanges1(new int[]{0,1,2,4,6,7}));
    }
}
