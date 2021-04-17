/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HospitalAdmin;

import java.util.ArrayList;


/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/17/2021            @author nakul       Added Hospital Admin Directory
 * 04/17/2021            @author nakul       Updated function name
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
    
    public HospitalAdmin getAdmin(String hospitalAdminUsername) {
        for(HospitalAdmin hospitalAdmin: hospitalAdminList) {
            if(hospitalAdmin.getAdminUsername().equalsIgnoreCase(hospitalAdminUsername)) {
                return hospitalAdmin;
            }
        }
        return null;
    }
    
    public HospitalAdmin createHospitalAdmin(String adminName, String adminUsername, String adminPassword) {
        hospitalAdmin = new HospitalAdmin(hospitalAdmin.getAdminId(), adminName, adminUsername, adminPassword);
        hospitalAdminList.add(hospitalAdmin);
        return hospitalAdmin;
    }
    
    public void deleteHospitalAdmin(String hospitalAdminUsername) {
        for(int i=0; i<hospitalAdminList.size(); i++) {
            if(hospitalAdminList.get(i).getAdminUsername().equals(hospitalAdminUsername)) {
                hospitalAdminList.remove(i);
            }
        }
    }
    
    public void updateAdmin(HospitalAdmin hospitalAdmin, String adminName, String adminUsername, String adminPassword) {
        for(HospitalAdmin updateAdmin: hospitalAdminList) {
            if(updateAdmin.getAdminUsername().equalsIgnoreCase(adminUsername)) {
                updateAdmin.adminName = adminName;
                updateAdmin.adminUsername = adminUsername;
                updateAdmin.adminPassword = adminPassword;
            }
        }
    }
}
