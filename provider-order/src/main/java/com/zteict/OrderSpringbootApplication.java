package com.zteict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.swing.*;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class OrderSpringbootApplication
{
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main( String[] args )
    {
        SpringApplication.run(OrderSpringbootApplication.class,args);
    }
}
