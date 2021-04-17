/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.EnterpriseRegistration.HospitalAdminRegistrationJPanel;

/**
 *
 * @author ajayp
 */
public class HospitalAdminRole extends Roles{
    
    private Roles.RoleType roleType;
    public HospitalAdminRole() {
        Roles.RoleType roleType = Roles.RoleType.HospitalAdmin;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        return new HospitalAdminRegistrationJPanel(userProcessContainer, account, network, system);
    }   
}
