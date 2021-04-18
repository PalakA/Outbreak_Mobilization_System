///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package Business;

import Business.Network.Network;
import Business.CareTaker.CareTakerDirectory;
import Business.Doctor.DoctorDirectory;
import Business.Hospital.HospitalRegistrationDirectory;
import Business.HospitalAdmin.HospitalAdminDirectory;
import Business.Organizations.Organization;
import Business.Patient.PatientDirectory;
import Business.Roles.Roles;
import Business.Roles.SystemAdminRole;
import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/12/2021            @author palak       Added directories to EcoSystem
 * 04/15/2021            @author palak       Added directories
 * 
 */

public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private PatientDirectory patientDirectory;
    private CareTakerDirectory careTakerDirectory;
    private DoctorDirectory doctorDirectory;
    private HospitalRegistrationDirectory hospitalRegistrationDirectory;
    private HospitalAdminDirectory hospitalAdminDirectory;

    public EcoSystem(PatientDirectory patientDirectory, CareTakerDirectory careTakerDirectory, DoctorDirectory doctorDirectory, String name, HospitalRegistrationDirectory hospitalRegistrationDirectory, HospitalAdminDirectory hospitalAdminDirectory) {
        super(name);
        this.patientDirectory = patientDirectory;
        this.careTakerDirectory = careTakerDirectory;
        this.doctorDirectory = doctorDirectory;
        this.hospitalRegistrationDirectory = hospitalRegistrationDirectory;
        this.hospitalAdminDirectory = hospitalAdminDirectory;
    }

    public HospitalRegistrationDirectory getHospitalRegistrationDirectory() {
        return hospitalRegistrationDirectory;
    }

    public void setHospitalRegistrationDirectory(HospitalRegistrationDirectory hospitalRegistrationDirectory) {
        this.hospitalRegistrationDirectory = hospitalRegistrationDirectory;
    }
        
    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public CareTakerDirectory getCareTakerDirectory() {
        return careTakerDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public HospitalAdminDirectory getHospitalAdminDirectory() {
        return hospitalAdminDirectory;
    }

    public void setHospitalAdminDirectory(HospitalAdminDirectory hospitalAdminDirectory) {
        this.hospitalAdminDirectory = hospitalAdminDirectory;
    }
        
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roleList=new ArrayList<Roles>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public static void setInstance(EcoSystem system) {	
        business = system;	
    }
            
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
    
    public boolean isUnique(String name){
        for(Network network : networkList){
            if(network.getName().equalsIgnoreCase(name)){
                return false;
            }
        }
        return true;
    }
}