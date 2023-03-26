package com.automobile.experience.main.controller;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.automobile.experience.main.model.entities.SpeedingIncidents;
import com.automobile.experience.main.model.entities.HardAcceleration;
import com.automobile.experience.main.model.entities.SeatbeltUsage;
import com.automobile.experience.main.model.entities.SuddenLaneChanges;
import com.automobile.experience.main.model.entities.HardBreaking;
import com.automobile.experience.main.model.entities.UserLogin;
import com.automobile.experience.main.service.CustomerDataDaoService;
import com.automobile.experience.main.service.UserLoginApplicationServiceDao;

@RestController
public class UserLoginController {
	
	List<Double> speedingIncidentsSample = Arrays.asList(83.85104189, 84.59282426, 101.8105477, 74.39729218,
			38.77309551, 74.22766584, 38.44817858, 92.23599409, 72.90286458);
	List<Double> hardaccelerationSample = Arrays.asList(6.484266461,8.39911937,21.264752502,33.760013506,9.588868742,12.910821617,6.314466631,5.14780222,4.430555453
			);
	List<Double> suddenLaneChangesData = Arrays.asList(1.0, 2.0, 3.0, 4.0, 1.0, 2.0, 3.0, 1.0, 5.0);
	List<Double> hardBreakingSample = Arrays.asList(0.007485379,0.986087389,0.964964057,0.926794006,0.966189965,0.731440932,0.919199382,0.750879104,0.62955237);
	List<Double> seatBeltUsageSample = Arrays.asList(10.0, 9.0, 10.0, 8.0, 3.0, 10.0, 8.0, 7.0, 3.0);

	
	HardAcceleration hardAccelerationStat=new HardAcceleration();
	HardBreaking hardBreakingStat=new HardBreaking();
	HardAcceleration speedingIncidentsStat=new HardAcceleration();
	SuddenLaneChanges suddenLaneChangesStat=new SuddenLaneChanges();
	SeatbeltUsage seatBeltUsageStat=new SeatbeltUsage();
	JSONObject obj = new JSONObject();
	
	@Autowired
	private UserLoginApplicationServiceDao userLoginApplicationServiceDao;
	
	@Autowired
	private CustomerDataDaoService customerDataDaoService;
	
    @RequestMapping("/")
    public String startInitialize() {
        return "Welcome to enriching Automotive experience";
    }
    @PostMapping("/createCustomer")
    public ResponseEntity<UserLogin> createCustomerLogin(@RequestBody UserLogin userLogin ) {
    	return ResponseEntity.ok().body(userLoginApplicationServiceDao.addUserId(userLogin));
    }
    @GetMapping("/employee/{id}")
	public UserLogin userLogin(@PathVariable int id) {
		return userLoginApplicationServiceDao.getUserbyId(id);
	}
    @GetMapping("/employees")
	public List<UserLogin> userLoginlist() {
		return userLoginApplicationServiceDao.getUseridList();
	}
    
//    Getting current driver details based on parameters
    
    @GetMapping("/cust001/speedingIncidentData")
	public JSONObject speedingCurrentdata() {
    	double data=speedingIncidentsStat.average(speedingIncidentsSample);
    	Object JsonData=obj.put("average", data);
		return obj;
	}
    
    @GetMapping("/cust001/suddenLaneChangeData")
	public JSONObject suddenLaneChangeCurrentdata() {
    	double data=speedingIncidentsStat.average(suddenLaneChangesData);
    	Object JsonData=obj.put("average", data);
		return obj;
	}
    
    @GetMapping("/cust001/seatBeltChangeData")
	public JSONObject seatBeltChangeCurrentDat() {
    	double data=seatBeltUsageStat.average(seatBeltUsageSample);
    	Object JsonData=obj.put("average", data);
		return obj;
	}
    @GetMapping("")
    public JSONObject seatBeltChangeAverageData() {
    	double data=speedingIncidentsStat.average(seatBeltUsageSample);
    	Object JsonData=obj.put("driving", data);
		return obj;
	}
    
    @GetMapping("/cust001/points")
	public JSONObject points() {
    	double data1=speedingIncidentsStat.pointsEarned();
    	double data2=hardBreakingStat.pointsEarned();
    	double data3=hardAccelerationStat.pointsEarned();
    	double data4=suddenLaneChangesStat.pointsEarned();
    	Object data = data1+data2+data3+data4;
    	Object JsonData=obj.put("pointsEarned", data);
		return obj;
	}
    
}
