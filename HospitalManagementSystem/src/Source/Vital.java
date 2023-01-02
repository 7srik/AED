/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Source;

/**
 *
 * @author srikr
 */
public class Vital extends Patient{
    protected int respirationRate;
    protected int heartRate;
    protected int height;
    protected int weight;
    private String abnormal;
    public Vital(){
        
    }
    
    public Vital(int rr, int hr, int h, int w, String abnormal) 
    {
        this.respirationRate = rr;
        this.heartRate = hr;
        this.height = h;
        this.weight = w;
        this.abnormal = abnormal;
        
    }
    
    public int getRespirationRate() {
        return respirationRate;
    }
    
    public void setRespirationRate(int respiratoryRate) {
        this.respirationRate = respiratoryRate;
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

    public String getAbnormal() {
        return abnormal;
    }

    public void setAbnormal(String abnormal) {
        this.abnormal = abnormal;
    }


    
}
