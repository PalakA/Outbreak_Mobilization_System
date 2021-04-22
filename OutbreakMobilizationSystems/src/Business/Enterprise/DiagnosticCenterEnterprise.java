/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

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
 * 04/14/2021            @author palak       Updated package names
 * 04/15/2021            @author palak       Added roles in function
 */

public class DiagnosticCenterEnterprise extends Enterprise {

    public DiagnosticCenterEnterprise(String name) {
        super(name,Enterprise.EnterpriseType.DiagnosticCenter);
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        
        roles = new ArrayList<Roles>();
        roles.add(new DiagnosticianRole());
        return roles;
    }
}
