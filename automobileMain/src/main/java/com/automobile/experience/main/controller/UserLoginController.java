package com.automobile.experience.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {
	
    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }
    @RequestMapping("/getCustomerById")
    public String getCustomerId() {
        return "Hello World!";
    }
}
