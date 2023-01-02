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
public class CommunityDirectory {
        
    private ArrayList<Community> communitys;
    public CommunityDirectory(){
        
        this.communitys=new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunitys() {
        return communitys;
    }

    public void setCommunitys(ArrayList<Community> communitys) {
        this.communitys = communitys;
    }
    
}
