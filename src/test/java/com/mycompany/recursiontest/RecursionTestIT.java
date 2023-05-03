
package com.mycompany.recursiontest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecursionTestIT
{
    
    public RecursionTestIT()
    {
    }

    
    @Test
    public void testFact()
    {
        System.out.println("fact");
        int n = 5;
        int expResult = 120;
        int result = RecursionTest.fact(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testReverseString()
    {
        System.out.println("reverseString");
        String input = "HowDoesitWork";
        String expResult = "kroWtiseoDwoH";
        String result = RecursionTest.reverseString(input);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsPalindrome()
    {
        System.out.println("isPalindrome");
        String input = "amanaplanacanalpanama";
        boolean expResult = true;
        boolean result = RecursionTest.isPalindrome(input);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSum()
    {
        System.out.println("sum");
        int n = 100;
        int expResult = 5050;
        int result = RecursionTest.sum(n);
        assertEquals(expResult, result);
    }


    @Test
    public void testAddUp()
    {
        System.out.println("addUp");
        int[] a = {5,4,3,2,1};
        int start = 0;
        int end = 5;
        int expResult = 15;
        int result = RecursionTest.addUp(a, start, end);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class RecursionTest.
     */


    
}
