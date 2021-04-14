/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OMS.Organizations;

import OMS.Roles.Roles;
import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 
 */

public class ManufacturerOrganization extends Organization{
    
    public ManufacturerOrganization() {
        super(Organization.Type.Manufacturer.getValue());
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        //roles.add(new Admin());
        return roles;
    }
}
