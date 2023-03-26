package com.automobile.experience.main.model.entities;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.automobile.experience.main.service.gamificationservice.GamificationService;

@Document(collection="speeding_incidents")
public class SpeedingIncidents implements GamificationService {
	
	List<Double> speedingIncidentsSample = Arrays.asList(83.85104189, 84.59282426, 101.8105477, 74.39729218,
			38.77309551, 74.22766584, 38.44817858, 92.23599409, 72.90286458);

	@Id
	List incidents;
	
	public SpeedingIncidents(List incidents) {
		super();
		this.incidents = incidents;
	}

	public List getIncidents() {
		return incidents;
	}

	public void setIncidents(List incidents) {
		this.incidents = incidents;
	}


	@Override
	public String title() {
		// TODO Auto-generated method stub
		return "Speeding Incidents";
	}

	@Override
	public double average(List<Double> speedingIncidentsSample) {
		Double average = speedingIncidentsSample.stream().mapToDouble(val->val).average().orElse(0);
		return average ;
	}

	@Override
	public double driver() {
		// TODO Auto-generated method stub
		return 74.22766584;
	}

	@Override
	public double pointsEarned() {
		double bestPerformer=200;
		double goodPerformer=100;
		double average=average(speedingIncidentsSample);
		double hundredPointer=((average)*0.4);
		double twoHundredPointer=((average)*0.7);
		List<Double> dataList= new LinkedList<Double>();
		Double pointsEarned = 50.0;
		for (Double element : speedingIncidentsSample) {
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
