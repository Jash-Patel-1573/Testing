/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countcharecter;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hadoop
 */
public class arrayTest {
    
    public arrayTest() {
    }

    /**
     * Test of count method, of class array.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        String a = "Jash";
        array instance = new array();
        int expResult = 4;
        int result = instance.count(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of concatinate method, of class Strings.
     */
    @Test
    public void testConcatinate() {
        System.out.println("concatinate");
        String[] s =  {"Jash", "Patel", "Patel"};
        array instance = new array();
        String expResult = "JashPatel";
        String result = instance.concatinate(s);
        assertEquals(expResult, result);
    }
    /**
     * Test of main method, of class array.
     */
    @Test
    public void testMain() {
    }
    
}
