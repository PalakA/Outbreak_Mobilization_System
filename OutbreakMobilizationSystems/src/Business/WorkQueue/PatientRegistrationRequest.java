/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author ajayp       Added Patient Information
 * 04/14/2021            @author ajayp       Added counter for patient id
 * 04/20/2021            @author palak       Added patient registration to work request
 */

public class PatientRegistrationRequest extends WorkRequest {
    
    private String patientId;
    private String patientName;
    private String patientAge;
    private String patientUsername;
    private String patientPassword;
    private String patientAddress;
    private String patientNumber;
    private String patientGender;
    private String patientEmailId;
    private String symptom1;
    private Network network;
    private Enterprise enterprise;
    private Organization.Type orgType;
    private Employee doctor;
    private Employee diagnostician;
    private Employee careTaker;
    private Employee labAssistant;
    int min = 100;
    int max = 999;

    public PatientRegistrationRequest() {
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
        patientId = "PATIENT"+randomNum;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientUsername() {
        return patientUsername;
    }

    public void setPatientUsername(String patientUsername) {
        this.patientUsername = patientUsername;
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getSymptom1() {
        return symptom1;
    }

    public void setSymptom1(String symptom1) {
        this.symptom1 = symptom1;
    }

    public String getPatientEmailId() {
        return patientEmailId;
    }

    public void setPatientEmailId(String patientEmailId) {
        this.patientEmailId = patientEmailId;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Organization.Type getOrgType() {
        return orgType;
    }

    public void setOrgType(Organization.Type orgType) {
        this.orgType = orgType;
    }

    public Employee getDoctor() {
        return doctor;
    }

    public void setDoctor(Employee doctor) {
        this.doctor = doctor;
    }

    public Employee getDiagnostician() {
        return diagnostician;
    }

    public void setDiagnostician(Employee diagnostician) {
        this.diagnostician = diagnostician;
    }

    public Employee getCareTaker() {
        return careTaker;
    }

    public void setCareTaker(Employee careTaker) {
        this.careTaker = careTaker;
    }

    public Employee getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(Employee labAssistant) {
        this.labAssistant = labAssistant;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    
    @Override
    public String toString() {
        return patientName;
    }
}
