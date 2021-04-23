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
import Business.Organizations.Organization;
import Business.Organizations.OrganizationDirectory;
import Business.Organizations.PharmacyCatalogOrganization;
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
 * 04/18/2021            @author ajayp       Added hospitalAdmin and Hospital Registry Directories
 * 04/18/2021            @author palak       Removed setter for hospitalAdmin and Hospital Registry Directories
 * 04/19/2021            @author palak       Removed Hospital Admin
 */

public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private CareTakerDirectory careTakerDirectory;
    private DoctorDirectory doctorDirectory;
    private HospitalRegistrationDirectory hospitalRegistrationDirectory;
    private OrganizationDirectory pharmacyDir;

    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        pharmacyDir = new OrganizationDirectory();
        
        this.pharmacyDir.getOrganizationList().add(new PharmacyCatalogOrganization("Boston Pharmacy", this));
        
    }
        
    public HospitalRegistrationDirectory getHospitalRegistrationDirectory() {
        return hospitalRegistrationDirectory;
    }

    public CareTakerDirectory getCareTakerDirectory() {
        return careTakerDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }
        
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }

    public OrganizationDirectory getPharmacyDir() {
        return pharmacyDir;
    }

    public void setPharmacyDir(OrganizationDirectory pharmacyDir) {
        this.pharmacyDir = pharmacyDir;
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