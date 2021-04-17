/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Roles.CareTakerRole;
import Business.Roles.DoctorRole;
import Business.Roles.ManagerRole;
import Business.Roles.PatientRole;
import Business.Roles.Roles;
import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/14/2021            @author palak       Updated package names
 * 04/15/2021            @author palak       Added roles in function
 * 
 */

public class HospitalEnterprise extends Enterprise {
    
    public HospitalEnterprise(String name){
        super(name,EnterpriseType.Hospital);
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        
        roles = new ArrayList<Roles>();
        roles.add(new ManagerRole());
        roles.add(new DoctorRole());
        roles.add(new CareTakerRole());
        roles.add(new PatientRole());
        return roles;
    }
    
}
