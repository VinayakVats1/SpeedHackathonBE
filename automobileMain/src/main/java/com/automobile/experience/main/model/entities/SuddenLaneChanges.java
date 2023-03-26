package com.automobile.experience.main.model.entities;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.LinkedList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.automobile.experience.main.service.gamificationservice.GamificationService;

@Document(collection="seatbelt_usage")
public class SuddenLaneChanges implements GamificationService {
	
	JSONObject obj = new JSONObject();
	List<Double> suddenLaneChangesData = Arrays.asList(1.0, 2.0, 3.0, 4.0, 1.0, 2.0, 3.0, 1.0, 5.0);
	
	@Id
	double suddenLaneChanges;
	
	public double getSuddenLaneChanges() {
		return suddenLaneChanges;
	}

	public void setSuddenLaneChanges(double suddenLaneChanges) {
		this.suddenLaneChanges = suddenLaneChanges;
	}

	public SuddenLaneChanges(double suddenLaneChanges) {
		super();
		this.suddenLaneChanges = suddenLaneChanges;
	}

	public SuddenLaneChanges() {
		this.suddenLaneChanges=suddenLaneChanges;
	}

	@Override
	public String title() {
		// TODO Auto-generated method stub
		return "Sudden Lane Changes";
	}

	@Override
	public double average(List<Double> data) {
		Double average = suddenLaneChangesData.stream().mapToDouble(val->val).average().orElse(0);
		return average ;
	}

	@Override
	public double driver() {
		return 2.0;
	}

	@Override
	public double pointsEarned() {
		double bestPerformer=200;
		double goodPerformer=100;
		double average=average(suddenLaneChangesData);
		double hundredPointer=((average)*0.4);
		double twoHundredPointer=((average)*0.7);
		double defaultPoints=50;
		double pointsEarned = defaultPoints;
		List<Double> dataList= new LinkedList<Double>();
		for (Double element : suddenLaneChangesData) {
			if(element>= average && element<=hundredPointer) {
				pointsEarned=100;
				dataList.add(pointsEarned);
			}else if(element>= average && element<=twoHundredPointer){
				pointsEarned=200;
				dataList.add(pointsEarned);
			}
		}
		System.out.println(pointsEarned);
		return pointsEarned;
	}

}
