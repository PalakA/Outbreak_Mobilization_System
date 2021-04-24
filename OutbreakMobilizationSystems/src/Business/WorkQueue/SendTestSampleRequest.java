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
 *
 * @author ajayp
 */
public class SendTestSampleRequest extends WorkRequest {
    
    private String sampleId;
    private Employee patientName;
    private String samples;
    private Enterprise hospitalName;
    private Network network;
    private Enterprise enterprise;
    private Organization.Type orgType;
    private Employee diagnostician;
    private Employee labAssistant;
    int min = 100;
    int max = 999;

    public SendTestSampleRequest() {
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
        sampleId = "SAMPLE"+randomNum;
    }

    public String getSampleId() {
        return sampleId;
    }

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    public Employee getPatientName() {
        return patientName;
    }

    public void setPatientName(Employee patientName) {
        this.patientName = patientName;
    }

    public String getSamples() {
        return samples;
    }

    public void setSamples(String samples) {
        this.samples = samples;
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

    public Enterprise getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(Enterprise hospitalName) {
        this.hospitalName = hospitalName;
    }

//    @Override
//    public String toString() {
//        return patientName;
//    }
}
