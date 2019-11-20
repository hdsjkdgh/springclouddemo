package com.zteict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 主程序
 * @author Yangpeng
 */

@SpringBootApplication
@EnableEurekaClient
public class UserSpringbootApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(UserSpringbootApplication.class,args);
    }
}
