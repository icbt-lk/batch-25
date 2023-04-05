/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.bushansirgur.onlinebookstore.service;

import in.bushansirgur.onlinebookstore.Dto.LoginDto;
import in.bushansirgur.onlinebookstore.Dto.UserDto;
import in.bushansirgur.onlinebookstore.payloadresponse.LoginMessage;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cool buddy
 */
@Service
public interface UserService {
    String addUser(UserDto userDto);
 
    LoginMessage loginUser(LoginDto loginDTO);
}
