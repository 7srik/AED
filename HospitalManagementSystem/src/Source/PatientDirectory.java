/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Source;

import java.util.ArrayList;

/**
 *
 * @author srikr
 */
public class PatientDirectory {
    private ArrayList<Patient> patient = new ArrayList();
    
    public PatientDirectory(){
        this.patient = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatient() {
        return patient;
    }

    public void setPatient(ArrayList<Patient> patient) {
        this.patient = patient;
    }
    public Patient addNewPatientDetails(){
        Patient addPatientDetails = new Patient();
        patient.add(addPatientDetails);
        return addPatientDetails;
    }
    public void deletePersonDetails(Person per){
        patient.remove(per);
    }
}
