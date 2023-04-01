/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BumbleBee.Application.service;

import com.BumbleBee.Application.model.User;
import com.BumbleBee.Application.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Cool buddy
 */
@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
       return userRepository.save(user);
    }

    
    @Override
    public List<User> getAllUser() {
       return userRepository.findAll();
    }
}
