/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author ajayp       Added Doctor Directory Information
 * 04/14/2021            @author palak       Updated Line 64 with equals sign
 */

public class DoctorDirectory {
    
    private Doctor doctor;
    private ArrayList<Doctor> doctorList;

    public DoctorDirectory(ArrayList<Doctor> doctorList) {
        this.doctorList = new ArrayList<Doctor>();
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    public Doctor getDoctor(String doctorUsername) {
        for(Doctor doctor: doctorList) {
            if(doctor.getDoctorUsername().equalsIgnoreCase(doctorUsername)) {
                return doctor;
            }
        }
        return null;
    }
    
    public Doctor createDoctor(String doctorId, String doctorName, String doctorUsername, String doctorPassword, String doctorNumber, String specialization) {
        doctor = new Doctor(doctorId, doctorName, doctorUsername, doctorPassword, doctorNumber, specialization);
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
