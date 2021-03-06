/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Roles.DiagnosticianRole;
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

public class SampleCollectionsOrganization extends Organization{
    
    public SampleCollectionsOrganization() {
        super(Organization.Type.SampleCollections.getValue());
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new DiagnosticianRole());
        return roles;
    }
}