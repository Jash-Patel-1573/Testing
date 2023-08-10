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
public class CountcharecterTest {
    
    public CountcharecterTest() {
    }

    @Test
    public void testMain() {
        
    }

    /**
     * Test of concatinate method, of class Countcharecter.
     */
    @Test
    public void testConcatinate() {
        System.out.println("concatinate");
        String[] s =  {"jash", "patel", "patel"};
        Countcharecter co = new Countcharecter();
        String expResult = "jashpatel";
        String[] exp = {"jash","patel","patel"};
        String result = co.concatinate(s);
        assertEquals(expResult, result);
        assertArrayEquals(exp, s);
        assertTrue(result, true);
   
    }

    /**
     * Test of count method, of class Countcharecter.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        String a = "Jash";
        Countcharecter instance = new Countcharecter();
        int expResult = 4;
        int result = instance.count(a);
        assertEquals(expResult, result);        
    }
    
}
