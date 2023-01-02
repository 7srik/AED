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
public class EncounterHistory {
    private static ArrayList<Encounter> encounterHistory = new ArrayList<Encounter>();

    public EncounterHistory() {
        //this.encounterHistory = new ArrayList<Encounter>();
    }
    public static ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    //public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
    //    this.encounterHistory = encounterHistory;
    //}
    public Encounter addNewEncounterDetails(){
        Encounter newEncounterDetails = new Encounter();
        encounterHistory.add(newEncounterDetails);
        return newEncounterDetails;
    }
    public void deleteEncounterDetails(Encounter pr){
        encounterHistory.remove(pr);
    }
   
    
}
