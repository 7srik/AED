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
public class PersonDirectory {
    private static ArrayList<Person> person = new ArrayList<Person>();
    
    public PersonDirectory(){
        //this.person = new ArrayList<Person>();
    }

    public static ArrayList<Person> getPerson() {
        return person;
    }

    //public void setPersons(ArrayList<Person> person) {
    //    this.person = person;
    //}
    
    public Person addNewPersonDetails(){
        Person addPersonDetails = new Person();
        person.add(addPersonDetails);
        return addPersonDetails;
    }
    
    public void deletePersonDetails(Person pr){
        person.remove(pr);
    }
   
}
