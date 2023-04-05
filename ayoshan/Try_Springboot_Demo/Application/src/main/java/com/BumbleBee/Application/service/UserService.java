/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BumbleBee.Application.service;

import com.BumbleBee.Application.model.User;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cool buddy
 */
@Service
public interface UserService {
    User saveUser(User user);
    List<User> getAllUser();
    
}
