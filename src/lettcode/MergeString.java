package lettcode;
//https://leetcode.com/problems/merge-strings-alternately/
public class MergeString {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder an = new StringBuilder();
        if(word1.length() == word2.length()){
            for (int i = 0; i < word1.length(); i++) {
                an.append(word1.charAt(i));
                an.append(word2.charAt(i));
            }
        }
        if(!(word1.length() == word2.length())){
            String min = word1.length() < word2.length()? word1 :word2;
            String max = word1.length() > word2.length()? word1 :word2;
            for (int i = 0; i < min.length(); i++) {
                an.append(word1.charAt(i));
                an.append(word2.charAt(i));
            }
            an.append(max.substring(min.length()));
        }
       
        return an.toString();

    }
}
