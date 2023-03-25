package com.automobile.experience.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.automobile.experience.main.model.entities.UserLogin;
import com.automobile.experience.main.service.UserLoginApplicationServiceDao;

@RestController
public class UserLoginController {
	
	@Autowired
	private UserLoginApplicationServiceDao userLoginApplicationServiceDao;
	
    @RequestMapping("/")
    public String startInitialize() {
        return "Welcome to enriching Automotive experience";
    }
    @PostMapping("/createCustomer")
    public ResponseEntity<UserLogin> createCustomerLogin(@RequestBody UserLogin userLogin ) {
    	return ResponseEntity.ok().body(userLoginApplicationServiceDao.addUserId(userLogin));
    }
    @GetMapping("/employee/{id}")
	public UserLogin userLogin(@PathVariable int id) {
		return userLoginApplicationServiceDao.getUserbyId(id);
	}
}
