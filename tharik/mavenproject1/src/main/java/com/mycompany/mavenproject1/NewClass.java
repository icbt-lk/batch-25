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
public class NewClass {
public static void main(String [] args) {
        System.out.println("Hello");
        
//        Person person = new Person();
//        person.setFirstName("John");
//        person.setLastName("Smith");
//        person.setNic("123V");
           Person person1 = new Person("123V", "John", "Smith");
           
           Person person2 = new Person("256V", "George", "Washington");
           
           System.out.println(person1.getNic());
           System.out.println(person2.getNic());
           
           Student st = new Student("ST001", "123V", "John", "Smith");
            
           System.out.println(st.getNic());
          
           Person p;
           
           p = new Person();
           p = new Student();
           p = new Lecturer();

           

    }
}
