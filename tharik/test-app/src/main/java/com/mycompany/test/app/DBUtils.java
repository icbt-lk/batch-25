/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test.app;

/**
 *
 * @author hnd
 */
public class DBUtils {
    
    public Student getStudent(int id) {
        //Write the code to read from DB
        Student st = new Student(1, "John");
        return st;
    }
    
    public boolean addStudent(Student st) {
        return true;
    }
    
    public boolean updateStudent(Student st) {
        return true;
    }
    
    public boolean deleteStudent(int id) {
        return true;
    }
}
