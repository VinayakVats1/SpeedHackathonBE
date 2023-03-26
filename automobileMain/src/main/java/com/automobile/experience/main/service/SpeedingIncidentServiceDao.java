package com.automobile.experience.main.service;

import java.util.List;

import com.automobile.experience.main.model.entities.SpeedingIncidents;

public interface SpeedingIncidentServiceDao {
	public List<SpeedingIncidents> getSpeedingIncidentList();
	public SpeedingIncidents addSpeedingIncident(SpeedingIncidents speedingIncident);
}
