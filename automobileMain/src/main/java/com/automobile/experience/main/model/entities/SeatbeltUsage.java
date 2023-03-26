package com.automobile.experience.main.model.entities;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.automobile.experience.main.service.gamificationservice.GamificationService;

@Document(collection="seatbelt_usage")
public class SeatbeltUsage implements GamificationService {

	List<Double> seatBeltUsageSample = Arrays.asList(10.0, 9.0, 10.0, 8.0, 3.0, 10.0, 8.0, 7.0, 3.0);

	
	@Id
	double seatbeltusage;
	
	public SeatbeltUsage(double seatbeltusage) {
		super();
		this.seatbeltusage = seatbeltusage;
	}
	
	public SeatbeltUsage() {
		this.seatbeltusage=seatbeltusage;
	}

	public double getSeatbeltusage() {
		return seatbeltusage;
	}

	public void setSeatbeltusage(double seatbeltusage) {
		this.seatbeltusage = seatbeltusage;
	}

	@Override
	public String title() {
		return "Seatbelt Usage";
	}

	@Override
	public double average(List<Double> seatBeltUsageSample) {
		Double average = seatBeltUsageSample.stream().mapToDouble(val->val).average().orElse(0);
		return average ;
	}

	@Override
	public double driver() {
		// TODO Auto-generated method stub
		return 3.0;
	}

	@Override
	public double pointsEarned() {
		double bestPerformer=200;
		double goodPerformer=100;
		double average=average(seatBeltUsageSample);
		double hundredPointer=((average)*0.4);
		double twoHundredPointer=((average)*0.7);
		double pointsEarned = 50.0;
		List<Double> dataList= new LinkedList<Double>();
		for (Double element : seatBeltUsageSample) {
			if(element>= average && element<=hundredPointer) {
				pointsEarned=100;
				dataList.add(pointsEarned);
			}else if(element>= average && element<=twoHundredPointer){
				pointsEarned=200;
				dataList.add(pointsEarned);
			}
		}
		return pointsEarned;
	}

}
