package com.automobile.experience.main.model.entities;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.automobile.experience.main.service.gamificationservice.GamificationService;

@Document(collection="hard_breaking")
public class HardBreaking implements GamificationService{
	
	List<Double> hardBreakingSample = Arrays.asList(0.007485379,0.986087389,0.964964057,0.926794006,0.966189965,0.731440932,0.919199382,0.750879104,0.62955237);
	
	@Id
	double hardBreaking;
	
	public HardBreaking(double hardBreaking) {
		super();
		this.hardBreaking = hardBreaking;
	}
	public HardBreaking() {
		this.hardBreaking=hardBreaking;
	}
	public double getHardBreaking() {
		return hardBreaking;
	}

	public void setHardBreaking(double hardBreaking) {
		this.hardBreaking = hardBreaking;
	}

	@Override
	public String title() {
		// TODO Auto-generated method stub
		return "Hard Breaking";
	}

	@Override
	public double average(List<Double> hardBreakingSample) {
		Double average = hardBreakingSample.stream().mapToDouble(val->val).average().orElse(0);
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
		double average=average(hardBreakingSample);
		double totalValue=average;
		double hundredPointer=((average)*0.4);
		double twoHundredPointer=((average)*0.7);
		double pointsEarned = 50;
		List<Double> dataList= new LinkedList<Double>();
		for (Double element : hardBreakingSample) {
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
