package lettcode;

import java.util.Arrays;

//https://leetcode.com/problems/longest-common-prefix/
public class let6 {
    public static String longestCommonPrefix(String[] strs) {
        if((strs == null || (strs.length == 0))){
            return "";
        }
        String check  = strs[0];
        for (int i = 1; i <strs.length ; i++) {
            while (strs[i].indexOf(check)!=0){
                check = check.substring(0,check.length()-1);
            }
            if (check.isEmpty()){return "";}
        }
        return check;
    }
    public String longestCommonPrefix1(String[] strs) {
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        int i=0;
        while(i<str1.length()){
            if(str1.charAt(i)==str2.charAt(i)){
                i++;
            }
            else{
                break;
            }
        }
        return str1.substring(0,i);
    }
    public String longestCommonPrefix2(String[] arr) {
        String prefix=arr[0];
        for(int i=1;i<arr.length;i++){
            while(arr[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
