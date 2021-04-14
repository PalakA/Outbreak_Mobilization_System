/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

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
 * 04/13/2021            @author palak       Added custructor
 * 04/14/2021            @author palak       Added getSuuportedRole function
 */

public class AdministrationOrganization extends Organization{
        
    public AdministrationOrganization() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new SystemAdminRole());
        return roles;
    }
}
