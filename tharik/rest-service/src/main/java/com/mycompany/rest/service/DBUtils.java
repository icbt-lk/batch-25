/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rest.service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hnd
 */
public class DBUtils {
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("ST01", "John", "Smith", "123V"));
        students.add(new Student("ST02", "George", "Whey", "345V"));
        return students;
    }
    
    public Student getStudent(String id) {
        //Write the code to read from DB
        Student st = new Student(id, "John", "Smith", "123V");
        return st;
    }
    
    public boolean addStudent(Student st) {
        return true;
    }
    
    public boolean updateStudent(Student st) {
        return true;
    }
    
    public boolean deleteStudent(String id) {
        return true;
    }
}
