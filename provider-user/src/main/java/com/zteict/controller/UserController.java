package com.zteict.controller;

import com.zteict.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Yangpeng
 */
@RestController
public class UserController {
    @GetMapping("/user/{id}")
    public User user(@PathVariable Long id){
        User user=new User(id,new Date());
        return user;
    }
}
