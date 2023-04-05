/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.bushansirgur.onlinebookstore.service.impl;

import in.bushansirgur.onlinebookstore.Dto.LoginDto;
import in.bushansirgur.onlinebookstore.Dto.UserDto;
import in.bushansirgur.onlinebookstore.entity.User;
import in.bushansirgur.onlinebookstore.payloadresponse.LoginMessage;
import in.bushansirgur.onlinebookstore.repository.UserRepository;
import in.bushansirgur.onlinebookstore.service.UserService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired(required=true)
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


/**
 *
 * @author Cool buddy
 */
@Service
public class UserImpl implements UserService{

    @Autowired
    private UserRepository userRepo;
 
    @Autowired
    private PasswordEncoder passwordEncoder;
 
    @Override
    public String addUser(UserDto userDto) {
 
        User user = new User(
 
                userDto.getUserid(),
                userDto.getUsername(),
                userDto.getEmail(),
 
               this.passwordEncoder.encode(userDto.getPassword())
        );
 
        userRepo.save(user);
 
        return user.getUsername();
    }
    UserDto userDto;
 
    @Override
    public LoginMessage  loginUser(LoginDto loginDTO) {
        String msg = "";
        User user1 = userRepo.findByEmail(loginDTO.getEmail());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = userRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginMessage("Login Success", true);
                } else {
                    return new LoginMessage("Login Failed", false);
                }
            } else {
 
                return new LoginMessage("password Not Match", false);
            }
        }else {
            return new LoginMessage("Email not exits", false);
        }
    }
}
