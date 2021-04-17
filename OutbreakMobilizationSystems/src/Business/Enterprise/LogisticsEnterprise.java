/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Roles.Roles;
import Business.Roles.SupplyChainRole;
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

public class LogisticsEnterprise extends Enterprise{
        
    public LogisticsEnterprise(String name) {
        super(name,Enterprise.EnterpriseType.Logistics);
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        
        roles.add(new SupplyChainRole());
        return roles;
    }
}