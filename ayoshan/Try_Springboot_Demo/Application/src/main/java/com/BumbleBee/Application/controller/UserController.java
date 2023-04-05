/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BumbleBee.Application.controller;

import com.BumbleBee.Application.model.User;
import com.BumbleBee.Application.service.UserService;
import com.BumbleBee.Application.service.UserServiceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cool buddy
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService uService;
    
    //private UserServiceImpl uService;
    
    @PostMapping("/add")
    public String add(@RequestBody User user){
        uService.saveUser(user);
        return "New user is added";
    }
    
    @GetMapping("/getAll")
    public List<User> list(){
        return uService.getAllUser();
    }
}
