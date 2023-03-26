package com.automobile.experience.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.automobile.experience.main.model.entities.CustomerData;
import com.automobile.experience.main.service.CustomerDataDaoService;

@RestController
public class CustomerDataController {
	@Autowired
	private CustomerDataDaoService customerDataDaoService;
	
	@PostMapping("/createCustomerData")
    public ResponseEntity<CustomerData> createCustomerLogin(@RequestBody CustomerData customerData ) {
    	return ResponseEntity.ok().body(customerDataDaoService.addCustomerUser(customerData));
    }
	
	@GetMapping("/listcustomers")
	public List<CustomerData> customerDataList() {
		return customerDataDaoService.getCustomerDataList();
	}
}
