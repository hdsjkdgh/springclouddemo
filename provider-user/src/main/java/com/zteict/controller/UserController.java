package com.zteict.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.zteict.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Yangpeng
 */
@RestController
public class UserController {

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/user/{id}")
    public User user(@PathVariable Long id){
        User user=new User(id,new Date());
        return user;
    }

    @GetMapping("/eurakeinfo")
    public String info(){
        InstanceInfo nextServerFromEureka = eurekaClient.getNextServerFromEureka("",false);
        return nextServerFromEureka.getHomePageUrl();
    }
}
