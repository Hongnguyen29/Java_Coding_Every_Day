package lettcode;

import java.util.HashMap;
import java.util.Map;

public class map3 {
    public boolean canConstruct(String ransomNote, String magazine) {//cach 1
        for (int i = 0; i < ransomNote.length(); i++) {
            int x =magazine.indexOf(ransomNote.charAt(i));
            if(x==-1){ return false;}
            magazine = magazine.substring(0,x) + magazine.substring(x+1);
        }
        return true;
    }
    public boolean canConstruct1 (String ransomNote, String magazine) {
        Map<Character,Integer> magMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char a = magazine.charAt(i);
            magMap.put(a, magMap.getOrDefault(a,0)+1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char b = ransomNote.charAt(i);
            if(magMap.getOrDefault(b,0)<=0){return false;}
            magMap.put(b,magMap.get(b)-1);
        }
        return true;
    }
    public boolean canConstruct2 (String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                // Remove the entry if count reaches zero
                if (map.get(c) == 0) {
                    map.remove(c);
                }
            }
        }
        return map.isEmpty();
    }
    public boolean canConstruct3(String ransomNote, String magazine) {
        var map = new HashMap<Character, Integer>();

        for (int i = 0; i < ransomNote.length(); i++) {
            var c = ransomNote.charAt(i);
            var currentCount = map.getOrDefault(c, 0);
            map.put(c, currentCount + 1);
        }
        for (int i = 0; i < magazine.length() && !map.isEmpty(); i++) {
            var c = magazine.charAt(i);
            if (map.containsKey(c)) {
                var count = map.get(c) - 1;
                if (count == 0) {
                    map.remove(c);
                } else {
                    map.put(c, count);
                }
            }
        }

        return map.isEmpty();
    }

}
