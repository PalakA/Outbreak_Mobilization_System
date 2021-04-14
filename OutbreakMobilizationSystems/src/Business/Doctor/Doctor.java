/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author ajayp       Added Doctor Information
 * 04/14/2021            @author ajayp       Added counter for doctor id
 */

public class Doctor {
    
    private static int count = 1;
    public int doctorId;
    public String doctorName;
    public String doctorUsername;
    public String doctorPassword;
    public String doctorNumber;
    public String specialization;
    
    public Doctor() {
        this.doctorId = count;
        count++;
    }

    public Doctor(int doctorId, String doctorName, String doctorUsername, String doctorPassword, String doctorNumber, String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorUsername = doctorUsername;
        this.doctorPassword = doctorPassword;
        this.doctorNumber = doctorNumber;
        this.specialization = specialization;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorUsername() {
        return doctorUsername;
    }

    public void setDoctorUsername(String doctorUsername) {
        this.doctorUsername = doctorUsername;
    }

    public String getDoctorPassword() {
        return doctorPassword;
    }

    public void setDoctorPassword(String doctorPassword) {
        this.doctorPassword = doctorPassword;
    }

    public String getDoctorNumber() {
        return doctorNumber;
    }

    public void setDoctorNumber(String doctorNumber) {
        this.doctorNumber = doctorNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return doctorName;
    }
}
