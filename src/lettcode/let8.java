package lettcode;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/
public class let8 {
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                int a = j!=i ? nums[j] : 1;
                product *= a;
            }
            answer[i] = product;
        }
        return answer;
    }
    public static int[] productExceptSelf1(int[] nums) { // chua dung
        int[] answer = new int[nums.length];
        int product =1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0) nums[i]=1;
           product *=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0) nums[i]=1;
            answer[i] = product/nums[i];
        }
        return answer;
    }
    public static int[] productExceptSelf2(int[] nums) {
        int size = nums.length;
        int[] res = new int[size];
        int pro =1 ;
        for(int i =0 ; i < size ; i++){
            res[i] = pro ;
            pro *= nums[i];
        }
        pro =1 ;
        for(int i =size -1 ; i >= 0 ; i--){
            res[i] *= pro ;
            pro *= nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf2( new int[]{1,2,3,4})));
    }
}
