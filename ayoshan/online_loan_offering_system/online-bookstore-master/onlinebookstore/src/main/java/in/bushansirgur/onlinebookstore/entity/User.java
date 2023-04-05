/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.bushansirgur.onlinebookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author Cool buddy
 */

@Entity
@Table(name="user")
public class User {
    
    @Id
    @Column(name="user_id", length = 45)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userid;
    
    @Column(name="user_name", length = 255)
	private String username;
    
    @Column(name="email", length = 255)
	private String email;
    
    @Column(name="password", length = 255)
	private String password;
    
    public User() {
    }
 
    public User(int userid, String username, String email, String password) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.password = password;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setEmail(String email){
        this.email= email;                
    }
    
    public void setPassword(String password){
        this.password= password;                
    }
    
    public int getUserid(){
        return userid;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPassword(){
        return password;
    }
   
}
