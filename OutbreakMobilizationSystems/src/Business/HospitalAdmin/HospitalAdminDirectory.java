/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HospitalAdmin;

import java.util.ArrayList;

/**
 *
 * @author ajayp
 */
public class HospitalAdminDirectory {
    
    private HospitalAdmin hospitalAdmin;
    private ArrayList<HospitalAdmin> hospitalAdminList;

    public HospitalAdminDirectory(ArrayList<HospitalAdmin> hospitalAdminList) {
        this.hospitalAdminList = new ArrayList<HospitalAdmin>();
    }

    public HospitalAdmin getHospitalAdmin() {
        return hospitalAdmin;
    }

    public void setHospitalAdmin(HospitalAdmin hospitalAdmin) {
        this.hospitalAdmin = hospitalAdmin;
    }

    public ArrayList<HospitalAdmin> getHospitalAdminList() {
        return hospitalAdminList;
    }

    public void setHospitalAdminList(ArrayList<HospitalAdmin> hospitalAdminList) {
        this.hospitalAdminList = hospitalAdminList;
    }
    
    public HospitalAdmin getDoctor(String hospitalAdminUsername) {
        for(HospitalAdmin hospitalAdmin: hospitalAdminList) {
            if(hospitalAdmin.getAdminUsername().equalsIgnoreCase(hospitalAdminUsername)) {
                return hospitalAdmin;
            }
        }
        return null;
    }
    
    public HospitalAdmin createHospitalAdmin(String adminName, String adminUsername, String adminPassword) {
        hospitalAdmin = new HospitalAdmin(hospitalAdmin.getAdminId(), adminName, adminUsername, adminPassword);
        doctorList.add(doctor);
        return doctor;
    }
    
    public void deleteDoctor(String doctorUsername) {
        for(int i=0; i<doctorList.size(); i++) {
            if(doctorList.get(i).getDoctorUsername().equals(doctorUsername)) {
                doctorList.remove(i);
            }
        }
    }
    
    public void updateDoctor(Doctor doctor, String doctorName, String doctorUsername, String doctorPassword, String doctorNumber, String specialization) {
        for(Doctor updateDoctor: doctorList) {
            if(updateDoctor.getDoctorUsername().equalsIgnoreCase(doctorUsername)) {
                doctor.doctorName = doctorName;
                doctor.doctorUsername = doctorUsername;
                doctor.doctorPassword = doctorPassword;
                doctor.doctorNumber = doctorNumber;
                doctor.specialization = specialization;
            }
        }
    }
}
