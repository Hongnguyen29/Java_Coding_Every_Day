package lettcode;

import java.util.HashMap;
import java.util.Map;
import java.util.jar.Manifest;

public class map5 {
//"balloon"
    public int maxNumberOfBalloons(String text) {
        if(text.length() < 7){return 0;}
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'b'){
                b +=1;
            }
            if(text.charAt(i) == 'a'){
                a +=1;
            }
            if(text.charAt(i) == 'l'){
                l +=1;
            }
            if(text.charAt(i) == 'o'){
                o +=1;
            }
            if(text.charAt(i) == 'n'){
                n +=1;
            }
        }
        if( b ==0 || a == 0 || l == 0|| o == 0 || n == 0 ){return 0;}
        int min = Math.min(a,Math.min(b,n));
        int mix = Math.min(l,o)/2;

        return Math.min(min,mix);
    }
}
