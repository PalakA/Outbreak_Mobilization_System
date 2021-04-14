/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

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
 * 04/14/2021            @author palak       Added getSuuportedRole function
 */

public class HospitalInvetoryOrganization extends Organization{
        
    public HospitalInvetoryOrganization() {
        super(Organization.Type.Hospital.getValue());
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
//        roles.add(new ManagerRole());
//        roles.add(new DoctorRole());
//        roles.add(new CareTakerRole());
//        roles.add(new PatientRole());
        return roles;
    }
}