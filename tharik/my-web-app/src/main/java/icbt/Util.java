/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icbt;

/**
 *
 * @author hnd
 */
public class Util {
    public static String getGreeting(String name) {
        return "Welcome " + name + "!";
    }
    
    
    public static Student[] getStudents() {
        Student[] students = new Student[3];
        students[0] = new Student("ST01", "John", "Smith");
        students[1] = new Student("ST02", "George", "Whey");
        students[2] = new Student("ST03", "Andrew", "Wills");
        
        return students;
    }
    
    public static boolean authenticate(String username, String password) {
        if (username == null && password == null) {
           return false;
        }
        return username.equals("icbt") && password.equals("icbt123");
    }
}
