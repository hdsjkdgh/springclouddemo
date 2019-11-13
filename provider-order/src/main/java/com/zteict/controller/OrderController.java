package com.zteict.controller;

import com.zteict.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    private String url="http://localhost:7900/user/";

    @GetMapping("/order/{id}")
    public User order(@PathVariable Long id){
        User user = restTemplate.getForObject(url+id, User.class);
        return user;
    }
}
