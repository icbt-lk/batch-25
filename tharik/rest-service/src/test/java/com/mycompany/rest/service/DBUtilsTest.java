/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rest.service;

import java.util.List;
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
     * Test of getStudents method, of class DBUtils.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        Student st = new Student("ST01", "John", "Smith", "123V");
        DBUtils instance = new DBUtils();
        List<Student> result = instance.getStudents();
        assertEquals(st.getId(), result.get(0).getId());
        assertEquals(st.getFirstName(), result.get(0).getFirstName());
        assertEquals(st.getLastName(), result.get(0).getLastName());
        assertEquals(st.getNic(), result.get(0).getNic());
        
    }

    /**
     * Test of getStudent method, of class DBUtils.
     */
    @Test
    public void testGetStudent() {
        System.out.println("getStudent");
        String id = "ST01";
        DBUtils instance = new DBUtils();
        Student expResult = new Student("ST01", "John", "Smith", "123V");
        Student result = instance.getStudent(id);
        assertEquals(expResult.getId(), result.getId());
        assertEquals(expResult.getFirstName(), result.getFirstName());
        assertEquals(expResult.getLastName(), result.getLastName());
        assertEquals(expResult.getNic(), result.getNic());
    }

    /**
     * Test of addStudent method, of class DBUtils.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student st = new Student("ST02", "Andrew", "Harris", "256V");
        DBUtils instance = new DBUtils();
        boolean expResult = true;
        boolean result = instance.addStudent(st);
        assertEquals(expResult, result);
      
        Student resStudent = instance.getStudent(st.getId());
        assertEquals(st.getId(), resStudent.getId());
        assertEquals(st.getFirstName(), resStudent.getFirstName());
        assertEquals(st.getLastName(), resStudent.getLastName());
        assertEquals(st.getNic(), resStudent.getNic());
    }

    /**
     * Test of updateStudent method, of class DBUtils.
     */
    @Test
    public void testUpdateStudent() {
        System.out.println("updateStudent");
        DBUtils instance = new DBUtils();
        Student st = new Student("ST03", "Andrew", "Harris", "256V");
        instance.addStudent(st);
        st = new Student("ST03", "Andrew2", "Harris2", "2562V");
        boolean expResult = true;
        boolean result = instance.updateStudent(st);
        assertEquals(expResult, result);
        
        Student resStudent = instance.getStudent(st.getId());
        assertEquals(st.getId(), resStudent.getId());
        assertEquals(st.getFirstName(), resStudent.getFirstName());
        assertEquals(st.getLastName(), resStudent.getLastName());
        assertEquals(st.getNic(), resStudent.getNic());
    }

    /**
     * Test of deleteStudent method, of class DBUtils.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        DBUtils instance = new DBUtils();
        
        Student st = new Student("ST04", "Andrew", "Harris", "256V");
        instance.addStudent(st);
        
        boolean expResult = true;
        boolean result = instance.deleteStudent(st.getId());
        assertEquals(expResult, result);
    }
    
}
