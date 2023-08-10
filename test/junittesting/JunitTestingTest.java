/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hadoop
 */
public class JunitTestingTest {
    
    public JunitTestingTest() {
    }
    
   

    /**
     * Test of add method, of class JunitTesting.
     */
    @Test
    public void testAdd() {
        
        JunitTesting jt = new JunitTesting();
        
        int actual = jt.add(5, 2);
        int exp = 7;
        
        assertEquals(exp, actual);
        
    }

    /**
     * Test of main method, of class JunitTesting.
     */
    @Test
    public void testMain() {
        
    }

    /**
     * Test of mul method, of class JunitTesting.
     */
    @Test
    public void testMul() {
        JunitTesting jt = new JunitTesting();
        
        int actual = jt.mul(5, 2, 5);
        int exp = 50;
        
        assertEquals(exp, actual);
    }

    /**
     * Test of str method, of class JunitTesting.
     */
    @Test
    public void testStr() {
        JunitTesting jt = new JunitTesting();
        
        String actual = jt.str("hello ", "World");
        String exp = "hello World";
        
        assertEquals(exp, actual);
    }
    
}
