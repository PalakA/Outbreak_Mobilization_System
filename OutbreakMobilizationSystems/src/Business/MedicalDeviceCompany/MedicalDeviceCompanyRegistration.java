/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalDeviceCompany;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/14/2021            @author ajayp       Added Medical Device Company Registration Information
 * 
 */

public class MedicalDeviceCompanyRegistration {
    
    private static int count = 1;
    public int medDeviceCompanyId;
    public String medDeviceCompanyName;
    public String medDeviceCompanyCity;
    public String medDeviceCompanyState;
    public String medDeviceCompanyLocation;
    
    public MedicalDeviceCompanyRegistration() {
        this.medDeviceCompanyId = count;
        count++;
    }

    public MedicalDeviceCompanyRegistration(int medDeviceCompanyId, String medDeviceCompanyName, String medDeviceCompanyCity, String medDeviceCompanyState, String medDeviceCompanyLocation) {
        this.medDeviceCompanyId = medDeviceCompanyId;
        this.medDeviceCompanyName = medDeviceCompanyName;
        this.medDeviceCompanyCity = medDeviceCompanyCity;
        this.medDeviceCompanyState = medDeviceCompanyState;
        this.medDeviceCompanyLocation = medDeviceCompanyLocation;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        MedicalDeviceCompanyRegistration.count = count;
    }

    public int getMedDeviceCompanyId() {
        return medDeviceCompanyId;
    }

    public void setMedDeviceCompanyId(int medDeviceCompanyId) {
        this.medDeviceCompanyId = medDeviceCompanyId;
    }

    public String getMedDeviceCompanyName() {
        return medDeviceCompanyName;
    }

    public void setMedDeviceCompanyName(String medDeviceCompanyName) {
        this.medDeviceCompanyName = medDeviceCompanyName;
    }

    public String getMedDeviceCompanyCity() {
        return medDeviceCompanyCity;
    }

    public void setMedDeviceCompanyCity(String medDeviceCompanyCity) {
        this.medDeviceCompanyCity = medDeviceCompanyCity;
    }

    public String getMedDeviceCompanyState() {
        return medDeviceCompanyState;
    }

    public void setMedDeviceCompanyState(String medDeviceCompanyState) {
        this.medDeviceCompanyState = medDeviceCompanyState;
    }

    public String getMedDeviceCompanyLocation() {
        return medDeviceCompanyLocation;
    }

    public void setMedDeviceCompanyLocation(String medDeviceCompanyLocation) {
        this.medDeviceCompanyLocation = medDeviceCompanyLocation;
    }

    @Override
    public String toString() {
        return medDeviceCompanyName;
    }
}
