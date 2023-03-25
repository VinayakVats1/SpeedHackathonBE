package com.automobile.experience.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.automobile.experience.main.model.entities.UserLogin;

@Service
public interface UserLoginApplicationServiceDao {
	public List<UserLogin> getUseridList();
	public UserLogin getUserbyId(int id);
	public UserLogin addUserId(UserLogin userLogin);
	public UserLogin updateUserLogin(UserLogin userLogin);
	public boolean deleteUserLogid(int id);
}
