/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/14/2021            @author ajayp       Added Pharmacy Registration Directory Information
 * 
 * 
 */

public class PharmacyRegistrationDirectory {
    
    private PharmacyRegistration pharmacyRegistration;
    private ArrayList<PharmacyRegistration> pharmacyRegistrationList;

    public PharmacyRegistrationDirectory(ArrayList<PharmacyRegistration> pharmacyRegistrationList) {
        this.pharmacyRegistrationList = new ArrayList<PharmacyRegistration>();
    }

    public PharmacyRegistration getPharmacyRegistration() {
        return pharmacyRegistration;
    }

    public void setPharmacyRegistration(PharmacyRegistration pharmacyRegistration) {
        this.pharmacyRegistration = pharmacyRegistration;
    }

    public ArrayList<PharmacyRegistration> getPharmacyRegistrationList() {
        return pharmacyRegistrationList;
    }

    public void setPharmacyRegistrationList(ArrayList<PharmacyRegistration> pharmacyRegistrationList) {
        this.pharmacyRegistrationList = pharmacyRegistrationList;
    }
    
    public PharmacyRegistration createPharmacyRegistration(String pharmacyName, String pharmacyCity, String pharmacyState, String pharmacyLocation) {
        pharmacyRegistration = new PharmacyRegistration(pharmacyRegistration.getPharmacyId(), pharmacyName, pharmacyCity, pharmacyState, pharmacyLocation);
        pharmacyRegistrationList.add(pharmacyRegistration);
        return pharmacyRegistration;
    }
    
    public void deletePharmacyRegistration(int diagnosticCenterId) {
        for(int i=0; i<pharmacyRegistrationList.size(); i++) {
            if(pharmacyRegistrationList.get(i).getPharmacyId() == diagnosticCenterId) {
                pharmacyRegistrationList.remove(i);
            }
        }
    }
    
    public void updatePharmacyRegistration(PharmacyRegistration pharmacyRegistration, String pharmacyName, String pharmacyCity, String pharmacyState, String pharmacyLocation) {
        for(PharmacyRegistration updatePharmacyRegistration: pharmacyRegistrationList) {
            if(updatePharmacyRegistration.getPharmacyId() == pharmacyRegistration.getPharmacyId()) {
                pharmacyRegistration.pharmacyName = pharmacyName;
                pharmacyRegistration.pharmacyCity = pharmacyCity;
                pharmacyRegistration.pharmacyState = pharmacyState;
                pharmacyRegistration.pharmacyLocation = pharmacyLocation;
            }
        }
    }
}
