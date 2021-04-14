/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author ajayp       Added Patient Directory Information
 * 
 */

public class PatientDirectory {
    
    private Patient patient;
    private ArrayList<Patient> patientList;

    public PatientDirectory(ArrayList<Patient> patientList) {
        this.patientList = new ArrayList<Patient>();
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient getPatient(String patientUsername) {
        for(Patient patient: patientList) {
            if(patient.getPatientUsername().equalsIgnoreCase(patientUsername)) {
                return patient;
            }
        }
        return null;
    }
    
    public Patient createPatient(String patientId, String patientName, String patientAge, String patientUsername, String patientPassword, String patientAddress, String patientNumber, 
            String patientGender, String symptom1, String symptom2, String symptom3) {
        patient = new Patient(patientId, patientName, patientAge, patientUsername, patientPassword, patientAddress, patientNumber, patientGender, symptom1, symptom2, symptom3);
        patientList.add(patient);
        return patient;
    }
    
    public void deletePatient(String patientUsername) {
        for(int i=0; i<patientList.size(); i++) {
            if(patientList.get(i).getPatientUsername() == patientUsername) {
                patientList.remove(i);
            }
        }
    }
    
    public void updatePatient(Patient patient, String patientName, String patientAge, String patientUsername, String patientPassword, String patientAddress, String patientNumber, 
            String patientGender, String symptom1, String symptom2, String symptom3) {
        for(Patient updatePatient: patientList) {
            if(updatePatient.getPatientUsername().equalsIgnoreCase(patientUsername)) {
                patient.patientName = patientName;
                patient.patientAge = patientAge;
                patient.patientUsername = patientUsername;
                patient.patientPassword = patientPassword;
                patient.patientAddress = patientAddress;
                patient.patientNumber = patientNumber;
                patient.patientGender = patientGender;
                patient.symptom1 = symptom1;
                patient.symptom2 = symptom2;
                patient.symptom3 = symptom3;
            }
        }
    }
}
