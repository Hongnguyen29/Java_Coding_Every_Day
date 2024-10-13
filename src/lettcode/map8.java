package lettcode;

import java.util.Arrays;
import java.util.Map;

//https://leetcode.com/problems/squares-of-a-sorted-array/description/
public class map8 {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i]*nums[i];
            nums[i] = a;
        }
         Arrays.sort(nums);
        return nums;
    }
    public static int[] sortedSquares1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i]*nums[i];
            nums[i] = a;
        }
        int [] n = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int min=nums[i];
            for (int j = i+1; j < nums.length -1 ; j++) {
                if(nums[i]>nums[j]){
                    min = nums[j];
                    nums[j]=nums[i];
                    nums[i]= min;
                }
            }
            n[i] =min;
        }
        return n;
    }
    public static int[] sortedSquares2(int[] nums) {
      int left = 0;
      int right = nums.length-1;
      int i = nums.length -1;
      int[] an = new int[nums.length];
      while (left<=right){
          if((Math.abs(nums[left]) >Math.abs(nums[right]))){
              an[i] = nums[left]*nums[left];
              left++;
          }
          else {an[i]= nums[right]*nums[right];
          right--;}
          i--;
      }
      return an;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares2(new int[]{-4,-1,0,3,10})));
    }



}
