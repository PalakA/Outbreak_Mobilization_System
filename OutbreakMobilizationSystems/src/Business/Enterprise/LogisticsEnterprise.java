/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

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
 * 
 */

public class LogisticsEnterprise extends Enterprise{
        
    public LogisticsEnterprise(String name) {
        super(name,Enterprise.EnterpriseType.Logistics);
    }
    @Override
    public ArrayList<Roles> getSupportedRole() {
        return null;
    }
}