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
    
    List<Student> students = new ArrayList<>();
    
    public DBUtils() {
        students.add(new Student("ST01", "John", "Smith", "123V"));
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    public Student getStudent(String id) {
        //Write the code to read from DB
        for(Student st : students) {
            if (st.getId().equals(id)) {
                return st;
            }
        }
        return null;
    }
    
    public boolean addStudent(Student st) {
        students.add(st);
        return true;
    }
    
    public boolean updateStudent(Student st) {
        students.stream().filter(st2 -> (st2.getId().equals(st.getId()))).map(st2 -> {
            st2.setFirstName(st.getFirstName());
            return st2;
        }).map(st2 -> {
            st2.setLastName(st.getLastName());
            return st2;
        }).forEachOrdered(st2 -> {
            st2.setNic(st.getNic());
        });
        return true;
    }
    
    public boolean deleteStudent(String id) {
        int i = 0;
        for(Student st : students) {
            if (st.getId().equals(id)) {
                students.remove(i);
                break;
            }
            i++;
        }
        return true;
    }
}
