/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.s1301;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jorge
 */
public class CalculaMayorTest {
    
    public CalculaMayorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of mayor method, of class CalculaMayor.
     */
    @Test
    public void testMayor() {
        System.out.println("mayor");
        int n1 = 2;
        int n2 = 3;
        int n3 = 4;
        CalculaMayor instance = new CalculaMayor();
        int expResult = 4;
        int result = instance.mayor(n1, n2, n3);
        assertEquals(expResult, result);

    }
        @Test
    public void testMayo2r() {
        System.out.println("mayor");
        int n1 = 3;
        int n2 = 4;
        int n3 = 2;
        CalculaMayor instance = new CalculaMayor();
        int expResult = 4;
        int result = instance.mayor(n1, n2, n3);
        assertEquals(expResult, result);

    }
}
