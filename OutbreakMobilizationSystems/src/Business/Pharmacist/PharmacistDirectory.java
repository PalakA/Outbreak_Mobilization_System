/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacist;

import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author ajayp       Added PharmacistDirectory Information
 * 04/14/2021            @author ajayp       Updated Line 57 for incrementing id using counter
 */

public class PharmacistDirectory {
    
    private Pharmacist pharmacist;
    private ArrayList<Pharmacist> pharmacistList;

    public PharmacistDirectory(ArrayList<Pharmacist> pharmacistList) {
        this.pharmacistList = new ArrayList<Pharmacist>();
    }

    public Pharmacist getPharmacist() {
        return pharmacist;
    }

    public void setPharmacist(Pharmacist pharmacist) {
        this.pharmacist = pharmacist;
    }

    public ArrayList<Pharmacist> getPharmacistList() {
        return pharmacistList;
    }

    public void setPharmacistList(ArrayList<Pharmacist> pharmacistList) {
        this.pharmacistList = pharmacistList;
    }
    
    public Pharmacist getPharmacist(String pharmacistUsername) {
        for(Pharmacist pharmacist: pharmacistList) {
            if(pharmacist.getPharmacistUsername().equalsIgnoreCase(pharmacistUsername)) {
                return pharmacist;
            }
        }
        return null;
    }
    
    public Pharmacist createPharmacist(String pharmacistName, String pharmacistUsername, String pharmacistPassword, String pharmacistNumber) {
        pharmacist = new Pharmacist(pharmacist.getPharmacistId(), pharmacistName, pharmacistUsername, pharmacistPassword, pharmacistNumber);
        pharmacistList.add(pharmacist);
        return pharmacist;
    }
    
    public void deletePharmacist(String pharmacistUsername) {
        for(int i=0; i<pharmacistList.size(); i++) {
            if(pharmacistList.get(i).getPharmacistUsername() == pharmacistUsername) {
                pharmacistList.remove(i);
            }
        }
    }
    
    public void updatePharmacist(Pharmacist pharmacist, String pharmacistId, String pharmacistName, String pharmacistUsername, String pharmacistPassword, String pharmacistNumber) {
        for(Pharmacist updatePharmacist: pharmacistList) {
            if(updatePharmacist.getPharmacistUsername().equalsIgnoreCase(pharmacistUsername)) {
                pharmacist.pharmacistName = pharmacistName;
                pharmacist.pharmacistUsername = pharmacistUsername;
                pharmacist.pharmacistPassword = pharmacistPassword;
                pharmacist.pharmacistNumber = pharmacistNumber;
            }
        }
    }
}
