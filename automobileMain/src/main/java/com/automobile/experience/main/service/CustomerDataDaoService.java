package com.automobile.experience.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.automobile.experience.main.model.entities.CustomerData;

@Service
public interface CustomerDataDaoService {
	public List<CustomerData> getCustomerDataList();
	public CustomerData getCustomerDataById(int id);
	public CustomerData addCustomerUser(CustomerData userLogin);
	public CustomerData updateCustomerData(CustomerData userLogin);
	public boolean deleteCustomerData(int id);
}
