/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Source;

/**
 *
 * @author srikr
 */
public class Encounter extends Person{
    private String name;
    private int encounter;
    private String doctorName;
    private Vital vital;
    
    public Encounter(String name,String doctorname, int encounter, Vital vital)
    {
        this.name=name;
        this.doctorName=doctorname;
        this.encounter=encounter;
        this.vital=vital;
    }

    Encounter() {
        id++;
       this.personid = id;
    }


    public int getEncounter() {
        return encounter;
    }

    public void setEncounter(int encounter) {
        this.encounter = encounter;
    }

    public Vital getVital() {
        return vital;
    }

    public void setVital(Vital vital) {
        this.vital = vital;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
      return getName(); 
    }

}
