/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calcmaven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 5im15aaduerst
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculate method, of class Calculator.
     */
    @org.junit.Test
    public void testCalculate() {
        System.out.println("calculate");
        int zahl1 = 0;
        int zahl2 = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.calculate(zahl1, zahl2);
        assertEquals(expResult, result);
       if (result != expResult){
           fail("ergebniss nicht wie erwartet ");
       }
       
        
    }
        @org.junit.Test
    public void testCalculate2() {
        System.out.println("calculate");
        int zahl1 = 5;
        int zahl2 = -6;
        Calculator instance = new Calculator();
        int expResult = -1;
        int result = instance.calculate(zahl1, zahl2);
        assertEquals(expResult, result);
       if (result != expResult){
           fail("ergebniss nicht wie erwartet ");
       }    
        
    }
            
    
}
