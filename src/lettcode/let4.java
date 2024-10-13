package lettcode;

public class let4 {
    public static boolean isSubsequence(String s, String t) {
        boolean an = true;
        for (int i = 0; i < s.length(); i++) {
            if (t.indexOf(s.charAt(i))==-1){
                an = false;
                break;
            }
            t=t.substring(t.indexOf(s.charAt(i))+1);
        }
        return an;
    }
    public static boolean isSubsequence1(String s, String t) {
        if(s.isEmpty()) return true;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (t.charAt(i) == s.charAt(j)){
                j++;
                if(j ==s.length()) return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
        System.out.println(isSubsequence("aaaaaa","bbaaaa"));

    }
}
