package lettcode;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/jewels-and-stones/description/
public class map1 {
    public static int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < jewels.length(); i++) {
            count.put(jewels.charAt(i),1);
        }
        int answer =0;
        System.out.println(count);
        for (int i = 0; i < stones.length(); i++) {
            if(count.get(stones.charAt(i)) !=null){
                answer++;
            }
        }
        return answer;
    }
    public static int numJewelsInStones1 (String jewels, String stones) {
        int answer =0;
        for (int i = 0; i < stones.length(); i++) {
            if(jewels.contains(stones.charAt(i)+""))
                answer++;
        }
        return answer;
    }
    public int numJewelsInStones2 (String jewels, String stones) {
        int c = 0;
        for(int i =0;i<jewels.length();i++){
            for(int j =0;j<stones.length();j++){
                if(jewels.charAt(i)== stones.charAt(j)){
                    c++;
                }
            }
        }
        return c;
    }


    public static void main(String[] args) {
        System.out.println(numJewelsInStones1("aA","aAAbbb"));
    }
}
