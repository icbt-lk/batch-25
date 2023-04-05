/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.bushansirgur.onlinebookstore.Dto;


/**
 *
 * @author Cool buddy
 */
public class UserDto {
    
	private int userid;
	private String username;
	private String email;
	private String password;
    
    public UserDto() {
    }
 
    public UserDto(int userid, String username, String email, String password) {
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
   
    @Override
    public String toString() {
        return "UserDto{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    
}
