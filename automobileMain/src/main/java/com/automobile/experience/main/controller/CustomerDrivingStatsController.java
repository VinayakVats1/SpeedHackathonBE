package com.automobile.experience.main.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.automobile.experience.main.model.entities.SpeedingIncidents;
import com.automobile.experience.main.model.entities.HardAcceleration;
import com.automobile.experience.main.model.entities.SeatbeltUsage;
import com.automobile.experience.main.model.entities.SuddenLaneChanges;
import com.automobile.experience.main.model.entities.HardBreaking;
import com.automobile.experience.main.service.SpeedingIncidentServiceDao;

@RestController
public class CustomerDrivingStatsController {
	
	HardAcceleration hardAccelerationStat=new HardAcceleration();
	HardBreaking hardBreakingStat=new HardBreaking();
	HardAcceleration speedingIncidentsStat=new HardAcceleration();
	SuddenLaneChanges suddenLaneChangesStat=new SuddenLaneChanges();
	SeatbeltUsage seatBeltUsageStat=new SeatbeltUsage();


//	@GetMapping("/customer/speedingIncidentList")
//	public String speedingList( int id) {
//		return "hello";
//	}
	
//	@PostMapping("/createSpeedingIncident")
//    public ResponseEntity<SpeedingIncidents> createIncident(@RequestBody SpeedingIncidents speedingIncidents ) {
//    	return ResponseEntity.ok().body(SpeedingIncidentServiceDao.addSpeedingIncident(speedingIncidents));
//    }
}