/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organization;

/**
 *
 * @author ajayp
 */
public class PatientDetailsRequest extends WorkRequest {
    
    private String patientId;
    private String hospitalName;
    private Enterprise diagnosticCenter;
    private Employee diagnostician;
    private Employee labAssistant;
    private String samples;
    private String patientName;
    private String Prescription;
    private String status;
    private String message;
    private String careTaker;
    private Organization Pharmacy;
    int min = 100;
    int max = 999;

    public PatientDetailsRequest() {
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
        patientId = "PATIENT"+randomNum;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
        
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Enterprise getDiagnosticCenter() {
        return diagnosticCenter;
    }

    public void setDiagnosticCenter(Enterprise diagnosticCenter) {
        this.diagnosticCenter = diagnosticCenter;
    }

    public Employee getDiagnostician() {
        return diagnostician;
    }

    public void setDiagnostician(Employee diagnostician) {
        this.diagnostician = diagnostician;
    }

    public Employee getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(Employee labAssistant) {
        this.labAssistant = labAssistant;
    }

    public String getSamples() {
        return samples;
    }

    public void setSamples(String samples) {
        this.samples = samples;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPrescription() {
        return Prescription;
    }

    public void setPrescription(String Prescription) {
        this.Prescription = Prescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCareTaker() {
        return careTaker;
    }

    public void setCareTaker(String careTaker) {
        this.careTaker = careTaker;
    }

    public Organization getPharmacy() {
        return Pharmacy;
    }

    public void setPharmacy(Organization Pharmacy) {
        this.Pharmacy = Pharmacy;
    }
}
