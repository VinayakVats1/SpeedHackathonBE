package com.automobile.experience.main.model;

public class UserLogin {
	int customerId;	

	public UserLogin() {
		super();
	}
	
	public UserLogin(int customerId) {
		this.customerId = customerId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
