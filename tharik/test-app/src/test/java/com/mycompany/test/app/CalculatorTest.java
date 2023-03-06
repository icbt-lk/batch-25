/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hnd
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @org.junit.jupiter.api.Test
    public void testAdd() {
        System.out.println("add");
        int no1 = 2;
        int no2 = 3;
        Calculator instance = new Calculator();
        int expResult = 5;
        int result = instance.add(no1, no2);
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testAddNegative() {
        System.out.println("add negative");
        int no1 = -4;
        int no2 = -5;
        Calculator instance = new Calculator();
        int expResult = -9;
        int result = instance.add(no1, no2);
        assertEquals(expResult, result);
    }
    
    
    @org.junit.jupiter.api.Test
    public void testCal() {
        System.out.println("add negative");
        int no1 = 4;
        Calculator instance = new Calculator();
        int expResult = 40;
        int result = instance.cal(no1);
        assertEquals(expResult, result);
    }
    
   @org.junit.jupiter.api.Test
    public void testCalBeyond100() {
        System.out.println("add negative");
        int no1 = 200;
        Calculator instance = new Calculator();
        int expResult = 40000;
        int result = instance.cal(no1);
        assertEquals(expResult, result);
    }
    
    
    @org.junit.jupiter.api.Test
    public void testGetStudent() {
        System.out.println("getStudent");
        int id = 1;
        Calculator instance = new Calculator();
        Student expResult = new Student(1, "John");
        Student result = instance.getStudent(id);
        assertEquals(expResult.getName(), result.getName());
        assertEquals(expResult.getNo(), result.getNo());
    }
}
