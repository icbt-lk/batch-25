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
public class Lecturer extends Person{
    private String empNo;
    
    public Lecturer() {
    }

    public Lecturer(String empNo, String nic, String firstName, String lastName) {
        super(nic, firstName, lastName);
        this.empNo = empNo;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }
    
    
    
    
}
