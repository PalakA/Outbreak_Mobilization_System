/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OMS.Roles;

import OMS.EcoSystem;
import OMS.Enterprise.Enterprise;
import OMS.Organizations.Organization;
import OMS.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/12/2021            @author palak       Added system admin role
 * 
 */

public class SystemAdminRole extends Roles{

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
