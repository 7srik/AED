/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Source;

/**
 *
 * @author srikr
 */
public class Person {
    String name;
    int age;    
    String gender;
    long phoneno;
    String emailid;
    String city;
    String community;
    String address;
    private String hospital;
    static int id=22000;
    int personid;
    
    public Person() {
       id++;
       this.personid = id;
    }
    public Person(int personid, String name, int age, String gender, long phoneno, String emailid, String address, String city, String community) 
    {
        this.name = name;
        this.personid = personid;
        this.age = age;
        this.gender = gender;
        this.phoneno = phoneno;
        this.emailid = emailid;
        this.address = address;
        this.city = city;
        this.community = community;
    }
    
    public Person(int personid, String name, int age, String gender, long phoneno, String emailid, String address, String city, String community, String hospital) 
    {
        this.name = name;
        this.personid = personid;
        this.age = age;
        this.gender = gender;
        this.phoneno = phoneno;
        this.emailid = emailid;
        this.address = address;
        this.city = city;
        this.community = community;
        this.hospital = hospital;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString(){
      return getName(); 
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int aId) {
        id = aId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

}
