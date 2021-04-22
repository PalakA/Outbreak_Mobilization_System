/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Roles.LabAssistantRole;
import Business.Roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author ajayp
 */
public class LaboratoriesEnterprise extends Enterprise {
    
    public LaboratoriesEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Laboratories);
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        
        roles = new ArrayList<Roles>();
        roles.add(new LabAssistantRole());
        return roles;
    }
}
