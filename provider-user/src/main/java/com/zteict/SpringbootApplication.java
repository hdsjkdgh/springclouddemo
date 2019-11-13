package com.zteict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * @author Yangpeng
 */
@SpringBootApplication()
public class SpringbootApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringbootApplication.class,args);
    }
}
