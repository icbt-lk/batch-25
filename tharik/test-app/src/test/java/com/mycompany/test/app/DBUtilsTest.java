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
public class DBUtilsTest {
    
    public DBUtilsTest() {
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
     * Test of getStudent method, of class DBUtils.
     */
    @Test
    public void testGetStudent() {
        System.out.println("getStudent");
        int id = 1;
        DBUtils instance = new DBUtils();
        Student expResult = new Student(1, "John");
        Student result = instance.getStudent(id);
        assertEquals(expResult.getNo(), result.getNo());
        assertEquals(expResult.getName(), result.getName());
    }

    /**
     * Test of addStudent method, of class DBUtils.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        
        
        Student st = new Student(1, "John");
        DBUtils instance = new DBUtils();
        
        //Testing add flow
        boolean expResult = true;
        boolean result = instance.addStudent(st);
        assertEquals(expResult, result);
        
        Student studentRes = instance.getStudent(st.getNo());
        assertEquals(st.getNo(), studentRes.getNo());
        assertEquals(st.getName(), studentRes.getName());
        
        //Testing update flow
        st.setName("George");
        result = instance.updateStudent(st);
        assertEquals(expResult, result);
        
        studentRes = instance.getStudent(st.getNo());
        assertEquals(st.getNo(), studentRes.getNo());
        assertEquals(st.getName(), studentRes.getName());
        
        //Testing delete flow
        result = instance.deleteStudent(st.getNo());
        assertEquals(expResult, result);
        
         studentRes = instance.getStudent(st.getNo());
         assertEquals("", studentRes.getNo());
         assertEquals("", studentRes.getName());
    }

    /**
     * Test of updateStudent method, of class DBUtils.
     */
    @Test
    public void testUpdateStudent() {
        System.out.println("updateStudent");
        Student st = null;
        DBUtils instance = new DBUtils();
        boolean expResult = false;
        boolean result = instance.updateStudent(st);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStudent method, of class DBUtils.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        int id = 0;
        DBUtils instance = new DBUtils();
        boolean expResult = false;
        boolean result = instance.deleteStudent(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
