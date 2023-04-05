/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.bushansirgur.onlinebookstore.controller;

import in.bushansirgur.onlinebookstore.Dto.UserDto;
import in.bushansirgur.onlinebookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cool buddy
 */
@RestController
@CrossOrigin
@RequestMapping ()

public class UserController {

    @Autowired
    private UserService userService;
    
    @PostMapping(path = "/save")
    public String saveUser (@RequestBody UserDto userDto)
    {
        String id = userService.addUser(userDto);
        return id;
    }
    
} 

