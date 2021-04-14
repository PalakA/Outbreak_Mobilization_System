/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import OMS.EcoSystem;
import OMS.Enterprise.Enterprise;
import OMS.Organizations.Organization;
import OMS.UserAccount.UserAccount;
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
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }    
}
