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
public class Calculator {
    public int add(int no1, int no2) {
        int sum = no1 +  no2;
        return sum;
    }
    
    
    public int cal(int i) {
        i = i * 10; 
        if (i >= 100) {
           i = i * 20;
        }
        return i;
    }
    
    public Student getStudent(int id) {
        Student st = new Student(1, "John");
        return st;
    }
}
