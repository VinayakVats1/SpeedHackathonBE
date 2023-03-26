package com.automobile.experience.main.model.entities;
public class SafetyData {
    private String customerId;
    private int seatbeltUsage;
    private int speedingIncidents;
    private int freqOfHardBraking;
    private int freqOfHardAcceleration;
    private int freqOfSuddenLaneChanges;
    private String distractionLevel;

    public SafetyData(String customerId, int seatbeltUsage, int speedingIncidents, int freqOfHardBraking,
                        int freqOfHardAcceleration, int freqOfSuddenLaneChanges, String distractionLevel) {
        this.customerId = customerId;
        this.seatbeltUsage = seatbeltUsage;
        this.speedingIncidents = speedingIncidents;
        this.freqOfHardBraking = freqOfHardBraking;
        this.freqOfHardAcceleration = freqOfHardAcceleration;
        this.freqOfSuddenLaneChanges = freqOfSuddenLaneChanges;
        this.distractionLevel = distractionLevel;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getSeatbeltUsage() {
        return seatbeltUsage;
    }

    public void setSeatbeltUsage(int seatbeltUsage) {
        this.seatbeltUsage = seatbeltUsage;
    }

    public int getSpeedingIncidents() {
        return speedingIncidents;
    }

    public void setSpeedingIncidents(int speedingIncidents) {
        this.speedingIncidents = speedingIncidents;
    }

    public int getFreqOfHardBraking() {
        return freqOfHardBraking;
    }

    public void setFreqOfHardBraking(int freqOfHardBraking) {
        this.freqOfHardBraking = freqOfHardBraking;
    }

    public int getFreqOfHardAcceleration() {
        return freqOfHardAcceleration;
    }

    public void setFreqOfHardAcceleration(int freqOfHardAcceleration) {
        this.freqOfHardAcceleration = freqOfHardAcceleration;
    }

    public int getFreqOfSuddenLaneChanges() {
        return freqOfSuddenLaneChanges;
    }

    public void setFreqOfSuddenLaneChanges(int freqOfSuddenLaneChanges) {
        this.freqOfSuddenLaneChanges = freqOfSuddenLaneChanges;
    }

    public String getDistractionLevel() {
        return distractionLevel;
    }

    public void setDistractionLevel(String distractionLevel) {
        this.distractionLevel = distractionLevel;
    }
}
