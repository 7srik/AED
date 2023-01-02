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
public class SystemAdmin {
    
    private ArrayList<City> citylist;
    private ArrayList<Community> communitylist;
    private ArrayList<Hospital> hospitallist;
    
    public SystemAdmin() {
        this.citylist = new ArrayList<City>();
        this.communitylist = new ArrayList<Community>();
        this.hospitallist = new ArrayList<Hospital>();
    }

    public ArrayList<City> getCitylist() {
        return citylist;
    }

    public void setCitylist(ArrayList<City> citylist) {
        this.citylist = citylist;
    }

    public ArrayList<Community> getCommunitylist() {
        return communitylist;
    }

    public void setCommunitylist(ArrayList<Community> communitylist) {
        this.communitylist = communitylist;
    }

    public ArrayList<Hospital> getHospitallist() {
        return hospitallist;
    }

    public void setHospitallist(ArrayList<Hospital> hospitallist) {
        this.hospitallist = hospitallist;
    }
    
}
