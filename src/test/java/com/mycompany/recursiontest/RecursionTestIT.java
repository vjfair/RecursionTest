/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.recursiontest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vjohn
 */
public class RecursionTestIT
{
    
    public RecursionTestIT()
    {
    }
    
    @BeforeAll
    public static void setUpClass()
    {
    }
    
    @AfterAll
    public static void tearDownClass()
    {
    }
    
    @BeforeEach
    public void setUp()
    {
    }
    
    @AfterEach
    public void tearDown()
    {
    }

    /**
     * Test of main method, of class RecursionTest.
     */
    @Test
    public void testMain()
    {
        System.out.println("main");
        String[] args = null;
        RecursionTest.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fact method, of class RecursionTest.
     */
    @Test
    public void testFact()
    {
        System.out.println("fact");
        int n = 0;
        int expResult = 0;
        int result = RecursionTest.fact(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reverseString method, of class RecursionTest.
     */
    @Test
    public void testReverseString()
    {
        System.out.println("reverseString");
        String input = "";
        String expResult = "";
        String result = RecursionTest.reverseString(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPalindrome method, of class RecursionTest.
     */
    @Test
    public void testIsPalindrome()
    {
        System.out.println("isPalindrome");
        String input = "";
        boolean expResult = false;
        boolean result = RecursionTest.isPalindrome(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sum method, of class RecursionTest.
     */
    @Test
    public void testSum()
    {
        System.out.println("sum");
        int n = 0;
        int expResult = 0;
        int result = RecursionTest.sum(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
