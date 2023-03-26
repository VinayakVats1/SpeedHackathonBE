package com.automobile.experience.main.model.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customer_data")
public class CustomerData {
	
	private String customerID;
	
	private int seatbeltUsage;
	private int speedingIncidents;
	private int frequencyOfHardBraking;
	private int frequencyOfHardAcceleration;
	private int frequencyOfSuddenLaneChanges;
	private String distractionLevel;
    
    
	public CustomerData(String customerID, int seatbeltUsage, int speedingIncidents,
			int frequencyOfHardBraking, int frequencyOfHardAcceleration, int frequencyOfSuddenLaneChanges,
			String distractionLevel) {
		super();
		this.customerID = customerID;
		this.seatbeltUsage = seatbeltUsage;
		this.speedingIncidents = speedingIncidents;
		this.frequencyOfHardBraking = frequencyOfHardBraking;
		this.frequencyOfHardAcceleration = frequencyOfHardAcceleration;
		this.frequencyOfSuddenLaneChanges = frequencyOfSuddenLaneChanges;
		this.distractionLevel = distractionLevel;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public double getSeatbeltUsage() {
		return seatbeltUsage;
	}
	public void setSeatbeltUsage(int seatbeltUsage) {
		this.seatbeltUsage = seatbeltUsage;
	}
	public double getSpeedingIncidents() {
		return speedingIncidents;
	}
	public void setSpeedingIncidents(int speedingIncidents) {
		this.speedingIncidents = speedingIncidents;
	}
	public double getFrequencyOfHardBraking() {
		return frequencyOfHardBraking;
	}
	public void setFrequencyOfHardBraking(int frequencyOfHardBraking) {
		this.frequencyOfHardBraking = frequencyOfHardBraking;
	}
	public double getFrequencyOfHardAcceleration() {
		return frequencyOfHardAcceleration;
	}
	public void setFrequencyOfHardAcceleration(int frequencyOfHardAcceleration) {
		this.frequencyOfHardAcceleration = frequencyOfHardAcceleration;
	}
	public double getFrequencyOfSuddenLaneChanges() {
		return frequencyOfSuddenLaneChanges;
	}
	public void setFrequencyOfSuddenLaneChanges(int frequencyOfSuddenLaneChanges) {
		this.frequencyOfSuddenLaneChanges = frequencyOfSuddenLaneChanges;
	}
	public String getDistractionLevel() {
		return distractionLevel;
	}
	public void setDistractionLevel(String distractionLevel) {
		this.distractionLevel = distractionLevel;
	}
	@Override
	public String toString() {
		return "CustomerData [customerID=" + customerID + ", seatbeltUsage=" + seatbeltUsage + ", speedingIncidents="
				+ speedingIncidents + ", frequencyOfHardBraking=" + frequencyOfHardBraking
				+ ", frequencyOfHardAcceleration=" + frequencyOfHardAcceleration + ", frequencyOfSuddenLaneChanges="
				+ frequencyOfSuddenLaneChanges + ", distractionLevel=" + distractionLevel + "]";
	}
	
    
}
