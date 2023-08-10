/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countcharecter;


import java.util.Arrays;

/**
 *
 * @author hadoop
 */
public class array {

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


