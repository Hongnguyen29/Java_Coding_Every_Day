package lettcode;
//https://leetcode.com/problems/roman-to-integer/
public class let3 {
    public static int romanToInt(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'I' : answer += 1;break;
                case 'V': answer += 5;break;
                case 'X' : answer +=10;break;
                case 'L' : answer +=50;break;
                case 'C': answer +=100;break;
                case 'D': answer +=500;break;
                case 'M': answer += 1000;break;
            }
        }
        if(s.contains("IV")) answer -=2;
        if(s.contains("IX")) answer -=2;
        if (s.contains("XL")) answer -=20;
        if (s.contains("XC")) answer -=20;
        if (s.contains("CD")) answer -=200;
        if (s.contains("CM")) answer -=200;

        return answer;


    }
    public static int romanToInt2(String s) {
        int ans = 0;
        int num = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            switch (s.charAt(i)) {
                case 'I' : num = 1;
                    break;
                case 'V' : num = 5;
                    break;
                case  'X' : num = 10;
                    break;
                case  'L' : num = 50;
                    break;
                case 'C' : num = 100;
                    break;
                case 'D' : num = 500;
                    break;
                case 'M' : num = 1000;
                    break;
            }
            if (num * 4 < ans) {
                ans -= num;
            } else ans += num;
        }
        return ans;
    }
    public static int romanToInt3(String s) {
        int num = 0;
        int last = value(s.charAt(0));
        int ans = last;
        for (int i = 1; i < s.length() ; i++) {
            num = value(s.charAt(i));
            if(num>last) ans -= 2*last;
            ans +=num;
            last = num;
        }
        return ans;
    }
    public static int value(char x){
        int num =0;
        switch (x) {
            case 'I' : num = 1;
                break;
            case 'V' : num = 5;
                break;
            case  'X' : num = 10;
                break;
            case  'L' : num = 50;
                break;
            case 'C' : num = 100;
                break;
            case 'D' : num = 500;
                break;
            case 'M' : num = 1000;
                break;
        }
        return  num;
    }

    public static void main(String[] args) {
      //  System.out.println(romanToInt("XXI"));
      //  System.out.println(romanToInt2("XXI"));
        System.out.println(romanToInt3("MCMXCIV"));

    }
}
