/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Source;

import java.util.ArrayList;
import Source.Vital;
/**
 *
 * @author srikr
 */
public class VitalHistory {
    private static ArrayList<Vital> vitalList = new ArrayList<Vital>();
    
    public VitalHistory()
    {
        
    }

    public static ArrayList<Vital> getVitalList() {
        return vitalList;
    }

    public static void setVitalList(ArrayList<Vital> vitalList) {
        VitalHistory.vitalList = vitalList;
    }
    public Vital addNewVitalSign(){
        Vital newVitalSign = new Vital();
        vitalList.add(newVitalSign);
        return newVitalSign;
    }
    
    public void deleteVitalSign(Vital vs){
        vitalList.remove(vs);
    }
}
