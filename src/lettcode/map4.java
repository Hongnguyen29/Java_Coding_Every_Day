package lettcode;

import java.util.HashMap;
import java.util.Map;

public class map4 {

    public static boolean isAnagram(String s, String t) {
        if(t.length() != s.length()){return false;}
        for (int i=0; i < t.length(); i++){
            int x = s.indexOf(t.charAt(i));
            if(x==-1){return false;}
            s = s.substring(0,x) + s.substring(x+1);
        }
        return true;
    }
    public static boolean isAnagram1 (String s, String t) {
        if(t.length() != s.length()){return false;}
        Map<Character, Integer> mapChar = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            mapChar.put(a, mapChar.getOrDefault(a,0)+1);
            mapChar.put(b, mapChar.getOrDefault(b,0)-1);
        }
        for (int i = 0; i < t.length(); i++) {
            char a = s.charAt(i);
            if(mapChar.get(a) != 0){
                return false;
            }
        }
        return true;
    }
   /* public static boolean isAnagram2 (String s, String t) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - t.charAt(i);
        }
        if(sum !=0) {return false;}
        else return true;
    }*/








    public static void main(String[] args) {
        System.out.println(isAnagram("ab","ba"));
    }
}
