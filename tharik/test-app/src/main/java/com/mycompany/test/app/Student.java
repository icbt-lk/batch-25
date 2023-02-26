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
public class Student {
   private String name;
   private int no;

    public Student(int no, String name) {
        this.name = name;
        this.no = no;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
   
   
}
