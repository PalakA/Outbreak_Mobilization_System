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
import ui.HospitalWorkArea.DoctorWorkAreaJPanel;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author nakul       Added Doctor role
 * 04/14/2021            @author palak       Added UserAccount, network and constructor
 */

public class DoctorRole extends Roles{

    private RoleType roleType;
    public DoctorRole() {
        RoleType roleType = RoleType.Doctor;
    }
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account, network, system);
    }
    
}
