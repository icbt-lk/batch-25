/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rest.service;

/**
 *
 * @author hnd
 */
public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String nic;

    public Student(String id, String firstName, String lastName, String nic) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic = nic;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
    
    
    
}
