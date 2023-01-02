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
public class CityDirectory {
    
    private static ArrayList<City> city = new ArrayList<City>();
    
    public CityDirectory(){
        //this.person = new ArrayList<Person>();
    }

    public static ArrayList<City> getCity() {
        return city;
    }

    //public void setPersons(ArrayList<Person> person) {
    //    this.person = person;
    //}
    
    public City addNewCityDetails(){
        City addCityDetails = new City();
        city.add(addCityDetails);
        return addCityDetails;
    }
    
    public void deletePersonDetails(City pr){
        city.remove(pr);
    }
}
