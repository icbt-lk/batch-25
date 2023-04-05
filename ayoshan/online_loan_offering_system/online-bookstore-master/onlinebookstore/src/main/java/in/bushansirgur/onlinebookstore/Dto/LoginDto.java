/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.bushansirgur.onlinebookstore.Dto;

/**
 *
 * @author Cool buddy
 */
public class LoginDto {

    private String email;
    private String password;

    public LoginDto() {
    }

    public LoginDto(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public void setEmail(String email){
        this.email= email;                
    }
    
    public void setPassword(String password){
        this.password= password;                
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPassword(){
        return password;
    }
     

}
