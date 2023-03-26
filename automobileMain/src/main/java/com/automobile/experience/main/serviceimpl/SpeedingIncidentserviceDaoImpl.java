package com.automobile.experience.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.automobile.experience.main.model.entities.SpeedingIncidents;
import com.automobile.experience.main.repository.config.SpeedingIncidentRepository;
import com.automobile.experience.main.repository.config.UserLoginRepository;
import com.automobile.experience.main.service.SpeedingIncidentServiceDao;

@Service
public class SpeedingIncidentserviceDaoImpl implements SpeedingIncidentServiceDao {
	
private SpeedingIncidentRepository speedingIncidentRepository;
	
	@Autowired
	public SpeedingIncidentserviceDaoImpl(UserLoginRepository userLoginRepository) {
		this.speedingIncidentRepository = speedingIncidentRepository;
	}
	
	@Override
	public List<SpeedingIncidents> getSpeedingIncidentList() {
		List<SpeedingIncidents> speedingIncidents = speedingIncidentRepository.findAll();
		return speedingIncidents;
	}

	@Override
	public SpeedingIncidents addSpeedingIncident(SpeedingIncidents speedingIncident) {
		SpeedingIncidents speedingIncidents =  speedingIncidentRepository.insert(speedingIncident);
		return speedingIncidents;
	}

}
