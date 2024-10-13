package lettcode;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/majority-element/description/
public class map7 {
    public int majorityElement(int[] nums) {
        int answer=0;   // số cần tìm
        int test = 0;   // số lần số xuất hiện nhiều nhất
        Map<Integer,Integer> map = new HashMap<>();  // tạo map
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue() > test){
                test = m.getValue();
                answer = m.getKey();
            }
        }
        return answer;
    }
}
