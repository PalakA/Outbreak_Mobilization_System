/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 *
 * Revision History:
 *
 * Date(MM/DD/YYYY)      Author           Comment 
 * 04/14/2021            @author ajayp    Added Hospital Registration Directory Information
 *
 *
 */
public class HospitalRegistrationDirectory {

    private HospitalRegistration hospitalRegistration;
    private ArrayList<HospitalRegistration> hospitalRegistrationList;

    public HospitalRegistrationDirectory(ArrayList<HospitalRegistration> hospitalRegistrationList) {
        this.hospitalRegistrationList = new ArrayList<HospitalRegistration>();
    }

    public HospitalRegistration getHospitalRegistration() {
        return hospitalRegistration;
    }

    public void setHospitalRegistration(HospitalRegistration hospitalRegistration) {
        this.hospitalRegistration = hospitalRegistration;
    }

    public ArrayList<HospitalRegistration> getHospitalRegistrationList() {
        return hospitalRegistrationList;
    }

    public void setHospitalRegistrationList(ArrayList<HospitalRegistration> hospitalRegistrationList) {
        this.hospitalRegistrationList = hospitalRegistrationList;
    }

    public HospitalRegistration createHospitalRegistration(String hospitalName, String hospitalCity, String hospitalState) {
        if (this.checkIfHospitalNameIsUnique(hospitalName)) {
            hospitalRegistration = new HospitalRegistration(hospitalRegistration.getHospitalId(), hospitalName, hospitalCity, hospitalState);
            hospitalRegistrationList.add(hospitalRegistration);
            return hospitalRegistration;
        }
        return null;
    }

    public void deleteHospitalRegistration(int hospitalId) {
        for (int i = 0; i < hospitalRegistrationList.size(); i++) {
            if (hospitalRegistrationList.get(i).getHospitalId() == hospitalId) {
                hospitalRegistrationList.remove(i);
            }
        }
    }

    public void updateHospitalRegistration(HospitalRegistration hospitalRegistration, String hospitalName, String hospitalCity, String hospitalState) {
        for (HospitalRegistration updateHospitalRegistration : hospitalRegistrationList) {
            if (updateHospitalRegistration.getHospitalId() == hospitalRegistration.getHospitalId()) {
                hospitalRegistration.hospitalName = hospitalName;
                hospitalRegistration.hospitalCity = hospitalCity;
                hospitalRegistration.hospitalState = hospitalState;
            }
        }
    }

    public boolean checkIfHospitalNameIsUnique(String hospitalName) {
        for (HospitalRegistration hospitalRegName : hospitalRegistrationList) {
            if (hospitalRegName.getHospitalName().equalsIgnoreCase(hospitalName)) {
                return false;
            }
        }
        return true;
    }
}
