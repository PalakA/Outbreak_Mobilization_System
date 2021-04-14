/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/14/2021            @author ajayp       Added Pharmacy Registration Information
 * 
 */

public class PharmacyRegistration {
    
    private static int count = 1;
    public int pharmacyId;
    public String pharmacyName;
    public String pharmacyCity;
    public String pharmacyState;
    public String pharmacyLocation;
    
    public PharmacyRegistration() {
        this.pharmacyId = count;
        count++;
    }

    public PharmacyRegistration(int pharmacyId, String pharmacyName, String pharmacyCity, String pharmacyState, String pharmacyLocation) {
        this.pharmacyId = pharmacyId;
        this.pharmacyName = pharmacyName;
        this.pharmacyCity = pharmacyCity;
        this.pharmacyState = pharmacyState;
        this.pharmacyLocation = pharmacyLocation;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        PharmacyRegistration.count = count;
    }

    public int getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(int pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getPharmacyCity() {
        return pharmacyCity;
    }

    public void setPharmacyCity(String pharmacyCity) {
        this.pharmacyCity = pharmacyCity;
    }

    public String getPharmacyState() {
        return pharmacyState;
    }

    public void setPharmacyState(String pharmacyState) {
        this.pharmacyState = pharmacyState;
    }

    public String getPharmacyLocation() {
        return pharmacyLocation;
    }

    public void setPharmacyLocation(String pharmacyLocation) {
        this.pharmacyLocation = pharmacyLocation;
    }

    @Override
    public String toString() {
        return pharmacyName;
    }
}
