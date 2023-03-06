/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author hnd
 */
public class Student extends Person {

    private String studentId;

    public Student() {
    }

    public Student(String studentId, String nic, String firstName, String lastName) {
        super(nic, firstName, lastName);
        this.studentId = studentId;
    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

}
