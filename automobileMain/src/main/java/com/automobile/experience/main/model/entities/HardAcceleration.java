package com.automobile.experience.main.model.entities;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.automobile.experience.main.service.gamificationservice.GamificationService;

@Document(collection="hard_acceleration")
public class HardAcceleration implements GamificationService {
	
	List<Double> hardaccelerationSample = Arrays.asList(6.484266461,8.39911937,21.264752502,33.760013506,9.588868742,12.910821617,6.314466631,5.14780222,4.430555453
			);
	
	@Id
	double hardAcceleration;

	@Override
	public String title() {
		return "Hard Acceleration";
	}

	@Override
	public double average(List<Double> hardaccelerationSample) {
		Double average = hardaccelerationSample.stream().mapToDouble(val->val).average().orElse(0);
		return average ;
	}

	@Override
	public double driver() {
		return 0.986087389;
	}

	@Override
	public double pointsEarned() {
		double bestPerformer=200;
		double goodPerformer=100;
		double average=average(hardaccelerationSample);
		double totalValue=average;
		double hundredPointer=((average)*0.4);
		double twoHundredPointer=((average)*0.7);
		List<Double> dataList= new LinkedList<Double>();
		double pointsEarned=50.0;
		for (Double element : hardaccelerationSample) {
			if(element>= average && element<=hundredPointer) {
				pointsEarned=100.0;
				dataList.add(pointsEarned);
			}else if(element>= average && element<=twoHundredPointer){
				pointsEarned=200.0;
				dataList.add(pointsEarned);
			}
		}
		return pointsEarned;
	}

}
