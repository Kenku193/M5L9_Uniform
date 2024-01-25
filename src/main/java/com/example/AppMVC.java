package com.example;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class AppMVC {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(AppMVC.class, args);

        UserService userService = run.getBean(UserService.class);
        List<User> all = userService.findAll();
        for (User user : all) {
            System.out.println(user);
        }

    }
}
