/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Source;

import java.util.List;

/**
 *
 * @author srikr
 */
public class City {
    protected String cityName;
    private List<Community> communities;
    private String community;
    private String hospital;
    
    public City(String cityName, String community, String hospital) {
        this.cityName = cityName;
        this.community= community;
        this.hospital=hospital;
    }
    
    public City(){
        
    }
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(List<Community> communities) {
        this.communities = communities;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    @Override
    public String toString(){
      return getCityName(); 
    }
}
