/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icbtg;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hnd
 */
@WebService(serviceName = "StudentService")
public class StudentService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hi " + txt + " !";
    }
    
//    @WebMethod(operationName = "getStudent")
//    public Student getStudent(@WebParam(name = "id") int id) {
//        Student st = new Student(id, "John", "Smith");
//        return st;
//    }
}
