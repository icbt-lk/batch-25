/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author hnd
 */
public class App {
    public static void main(String [] args) { 
        
        DBUtil util = new MongoDBUtil();
        BL.process(util);
    }
}
