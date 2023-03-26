package com.automobile.experience.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.automobile.experience.main.model.entities.CustomerData;
import com.automobile.experience.main.model.entities.UserLogin;
import com.automobile.experience.main.repository.config.CustomerDataRepository;
import com.automobile.experience.main.repository.config.UserLoginRepository;
import com.automobile.experience.main.service.CustomerDataDaoService;

@Service
public class CustomerDataDaoServiceImpl implements CustomerDataDaoService {
	
	private CustomerDataRepository customerDataRepository;

	@Autowired
	public CustomerDataDaoServiceImpl(CustomerDataRepository customerDataRepository) {
		this.customerDataRepository = customerDataRepository;
	}
	
	@Override
	public List<CustomerData> getCustomerDataList() {
		List<CustomerData> customer = customerDataRepository.findAll();
		return customer;
	}

	@Override
	public CustomerData getCustomerDataById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerData addCustomerUser(CustomerData customer) {
		CustomerData newCustomer = customerDataRepository.insert(customer);
		return newCustomer;
	}

	@Override
	public CustomerData updateCustomerData(CustomerData userLogin) {
		// TODO Auto-generated method stub
		return userLogin;
	}

	@Override
	public boolean deleteCustomerData(int id) {
		// TODO Auto-generated method stub
		return true;
	}

}
