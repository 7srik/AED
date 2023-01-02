/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Source;

/**
 *
 * @author srikr
 */
public class Doctor extends Person {
    
    private String doctorName;
    private String docUsername;
    private String docPassword;
    private String hospital;
    
    public Doctor(int personid, String name, String hospital, int age, String gender, long phoneno, String emailid, String address, String city, String community, String uname, String pwd) 
    {
        this.doctorName = name;
        this.personid = personid;
        this.age = age;
        this.gender = gender;
        this.phoneno = phoneno;
        this.emailid = emailid;
        this.address = address;
        this.city = city;
        this.community = community;
        this.hospital = hospital;
        this.docUsername=uname;
        this.docPassword=pwd;
    }

    Doctor() {
       id++;
       this.personid = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDocUsername() {
        return docUsername;
    }

    public void setDocUsername(String docUsername) {
        this.docUsername = docUsername;
    }

    public String getDocPassword() {
        return docPassword;
    }

    public void setDocPassword(String docPassword) {
        this.docPassword = docPassword;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    @Override
    public String toString(){
      return getDoctorName(); 
    }
    
}
