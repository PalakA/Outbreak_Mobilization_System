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
 * 
 */

public class Pharmacist {
    
    public String pharmacistId;
    public String pharmacistName;
    public String pharmacistUsername;
    public String pharmacistPassword;
    public String pharmacistNumber;

    public Pharmacist(String pharmacistId, String pharmacistName, String pharmacistUsername, String pharmacistPassword, String pharmacistNumber) {
        this.pharmacistId = pharmacistId;
        this.pharmacistName = pharmacistName;
        this.pharmacistUsername = pharmacistUsername;
        this.pharmacistPassword = pharmacistPassword;
        this.pharmacistNumber = pharmacistNumber;
    }

    public String getPharmacistId() {
        return pharmacistId;
    }

    public void setPharmacistId(String pharmacistId) {
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
        return pharmacistId;
    }
}
