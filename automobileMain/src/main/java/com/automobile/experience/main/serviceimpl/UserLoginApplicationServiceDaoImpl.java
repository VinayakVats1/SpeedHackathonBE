package com.automobile.experience.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.automobile.experience.main.model.entities.UserLogin;
import com.automobile.experience.main.repository.config.UserLoginRepository;
import com.automobile.experience.main.service.UserLoginApplicationServiceDao;

@Service
public class UserLoginApplicationServiceDaoImpl implements UserLoginApplicationServiceDao {

	
	private UserLoginRepository userLoginRepository;
	
	@Autowired
	public UserLoginApplicationServiceDaoImpl(UserLoginRepository userLoginRepository) {
		this.userLoginRepository = userLoginRepository;
	}

	@Override
	public List<UserLogin> getUseridList() {
		List<UserLogin> employee = userLoginRepository.findAll();
		return employee;
	}

	@Override
	public UserLogin getUserbyId(int id) {
		Optional<UserLogin> user = userLoginRepository.findById(id);
		if (!user.isEmpty()) {
			return user.get();
		}
		return null;
	}

	@Override
	public UserLogin addUserId(UserLogin user) {
		UserLogin userLogin = userLoginRepository.insert(user);
		return userLogin;
	}

	@Override
	public UserLogin updateUserLogin(UserLogin userLogin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUserLogid(int id) {
		Optional<UserLogin> userLogin = userLoginRepository.findById(id);

		if (!userLogin.isEmpty()) {
			userLoginRepository.delete(userLogin.get());
			return true;
		}
		return false;
	}
	
}
