/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Source;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author srikr
 */
public class Patient extends Person {
    private int patientId;
    private String doctorName;
    private int respirationRate;
    private int heartRate;
    private int height;
    private int weight;
    protected boolean abnormal;
    protected Date date;
    protected ArrayList<Encounter> encounter_History;

    public Patient() {
        this.encounter_History = new ArrayList<Encounter>();;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

      public boolean isAbnormal() {
        return abnormal;
    }

    public void setAbnormal(boolean abnormal) {
        this.abnormal = abnormal;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public ArrayList<Encounter> getEncounter_History() {
        return encounter_History;
    }

    public void setEncounter_History(ArrayList<Encounter> encounter_History) {
        this.encounter_History = encounter_History;
    }
    
     public Encounter addNewEncounterDetails(){
        Encounter newEncounterDetails = new Encounter();
        encounter_History.add(newEncounterDetails);
        return newEncounterDetails;
    }

}
