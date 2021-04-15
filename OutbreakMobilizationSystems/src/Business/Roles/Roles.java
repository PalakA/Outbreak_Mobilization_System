/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author palak       Added Roles class
 * 04/15/2021            @author palak       Added network in createWorkArea class
 */

public abstract class Roles {
    
    public enum RoleType{
        SysAdmin("SysAdmin"),
        Doctor("Doctor"),
        Diagnostician("Diagnostician"),
        Manager("Manager"),
        Manufacturer("Manufacturer"),
        Pathologist("Pathologist"),
        Patient("Patient"),
        Pharmacist("Pharmacist"),
        SupplyChain("SupplyChain"),
        CareTaker("CareTaker");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise,
            Network network,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }    
}
