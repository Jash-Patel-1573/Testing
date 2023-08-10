package countcharecter;

/**
 *
 * @author hadoop
 */

import java.util.Arrays;

public class Countcharecter {

    String count;
    
    public int count(String a){
        int count = a.length();
        return count;
    }

    public String concatinate(String[] s){
        String str = "";
        for (int i = 0; i < s.length; i++) {
            if(!str.contains(s[i])){
                str = str.concat(s[i]);
            }
        }
        System.out.println(str);
        return str;
    }
    
    public static void main(String[] args) {
        
    }
    
}
