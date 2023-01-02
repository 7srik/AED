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
public class DoctorDirectory {
    
    private static ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    
    public DoctorDirectory(){
        //this.doctors= new ArrayList<Doctor>();
    }

    public static ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    //public void setDoctors(ArrayList<Doctor> doctors) {
    //    this.doctors = doctors;
    //}
    
    public Doctor addNewDoctorDetails(){
        Doctor addDoctorDetails = new Doctor();
        doctors.add(addDoctorDetails);
        return addDoctorDetails;
    }
    
    public void deleteDoctorDetails(Doctor dr){
        doctors.remove(dr);
    }
}
