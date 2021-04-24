/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacist;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author ajayp       Added Pharmacist Information
 * 04/14/2021            @author ajayp       Added counter for pharmacist id
 */

public class Pharmacist {
    
    private static int count = 1;
    public int pharmacistId;
    public String pharmacistName;
    public String pharmacistUsername;
    public String pharmacistPassword;
    public String pharmacistNumber;
    
    public Pharmacist() {
        this.pharmacistId = count;
        count++;
    }

    public Pharmacist(int pharmacistId, String pharmacistName, String pharmacistUsername, String pharmacistPassword, String pharmacistNumber) {
        this.pharmacistId = pharmacistId;
        this.pharmacistName = pharmacistName;
        this.pharmacistUsername = pharmacistUsername;
        this.pharmacistPassword = pharmacistPassword;
        this.pharmacistNumber = pharmacistNumber;
    }

    public int getPharmacistId() {
        return pharmacistId;
    }

    public void setPharmacistId(int pharmacistId) {
        this.pharmacistId = pharmacistId;
    }

    public String getPharmacistName() {
        return pharmacistName;
    }

    public void setPharmacistName(String pharmacistName) {
        this.pharmacistName = pharmacistName;
    }

    public String getPharmacistUsername() {
        return pharmacistUsername;
    }

    public void setPharmacistUsername(String pharmacistUsername) {
        this.pharmacistUsername = pharmacistUsername;
    }

    public String getPharmacistPassword() {
        return pharmacistPassword;
    }

    public void setPharmacistPassword(String pharmacistPassword) {
        this.pharmacistPassword = pharmacistPassword;
    }

    public String getPharmacistNumber() {
        return pharmacistNumber;
    }

    public void setPharmacistNumber(String pharmacistNumber) {
        this.pharmacistNumber = pharmacistNumber;
    }

    @Override
    public String toString() {
        return pharmacistName;
    }
}
