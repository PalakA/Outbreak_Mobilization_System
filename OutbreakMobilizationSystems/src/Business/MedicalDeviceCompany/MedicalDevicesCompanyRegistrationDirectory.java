/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalDeviceCompany;

import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/14/2021            @author ajayp       Added Medical Device Company Registration Directory Information
 * 
 * 
 */

public class MedicalDevicesCompanyRegistrationDirectory {
    
    private MedicalDeviceCompanyRegistration medicalDeviceCompanyRegistration;
    private ArrayList<MedicalDeviceCompanyRegistration> medicalDeviceCompanyRegistrationList;

    public MedicalDevicesCompanyRegistrationDirectory(ArrayList<MedicalDeviceCompanyRegistration> medicalDeviceCompanyRegistrationList) {
        this.medicalDeviceCompanyRegistrationList = new ArrayList<MedicalDeviceCompanyRegistration>();
    }

    public MedicalDeviceCompanyRegistration getMedicalDeviceCompanyRegistration() {
        return medicalDeviceCompanyRegistration;
    }

    public void setMedicalDeviceCompanyRegistration(MedicalDeviceCompanyRegistration medicalDeviceCompanyRegistration) {
        this.medicalDeviceCompanyRegistration = medicalDeviceCompanyRegistration;
    }

    public ArrayList<MedicalDeviceCompanyRegistration> getMedicalDeviceCompanyRegistrationList() {
        return medicalDeviceCompanyRegistrationList;
    }

    public void setMedicalDeviceCompanyRegistrationList(ArrayList<MedicalDeviceCompanyRegistration> medicalDeviceCompanyRegistrationList) {
        this.medicalDeviceCompanyRegistrationList = medicalDeviceCompanyRegistrationList;
    }
    
    public MedicalDeviceCompanyRegistration createMedicalDeviceCompanyRegistration(String medDeviceCompanyName, String medDeviceCompanyCity, String medDeviceCompanyState, String medDeviceCompanyLocation) {
        medicalDeviceCompanyRegistration = new MedicalDeviceCompanyRegistration(medicalDeviceCompanyRegistration.getMedDeviceCompanyId(), medDeviceCompanyName, medDeviceCompanyCity, medDeviceCompanyState, medDeviceCompanyLocation);
        medicalDeviceCompanyRegistrationList.add(medicalDeviceCompanyRegistration);
        return medicalDeviceCompanyRegistration;
    }
    
    public void deleteMedicalDeviceCompanyRegistration(int medDeviceCompanyId) {
        for(int i=0; i<medicalDeviceCompanyRegistrationList.size(); i++) {
            if(medicalDeviceCompanyRegistrationList.get(i).getMedDeviceCompanyId() == medDeviceCompanyId) {
                medicalDeviceCompanyRegistrationList.remove(i);
            }
        }
    }
    
    public void updatemedicalDeviceCompanyRegistrationList(MedicalDeviceCompanyRegistration medicalDeviceCompanyRegistration, String medDeviceCompanyName, String medDeviceCompanyCity, String medDeviceCompanyState, String medDeviceCompanyLocation) {
        for(MedicalDeviceCompanyRegistration updateMedicalDeviceCompanyRegistration: medicalDeviceCompanyRegistrationList) {
            if(updateMedicalDeviceCompanyRegistration.getMedDeviceCompanyId() == medicalDeviceCompanyRegistration.getMedDeviceCompanyId()) {
                medicalDeviceCompanyRegistration.medDeviceCompanyName = medDeviceCompanyName;
                medicalDeviceCompanyRegistration.medDeviceCompanyCity = medDeviceCompanyCity;
                medicalDeviceCompanyRegistration.medDeviceCompanyState = medDeviceCompanyState;
                medicalDeviceCompanyRegistration.medDeviceCompanyLocation = medDeviceCompanyLocation;
            }
        }
    }
}
