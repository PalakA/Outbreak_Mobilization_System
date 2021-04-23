/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Medicine.MedicineDirectory;
import Business.Roles.PharmacistRole;
import Business.Roles.Roles;
import Business.UserAccount.UserAccount;
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

public class PharmacyCatalogOrganization extends Organization{
    
    private MedicineDirectory medicineDirectory;
    private UserAccount userAccountAssoc;
    private String pharmacyName;
    
    public MedicineDirectory getMedicineDirectory() {
        return medicineDirectory;
    }

    public void setMedicineDirectory(MedicineDirectory medicineDirectory) {
        this.medicineDirectory = medicineDirectory;
    }

    public UserAccount getUserAccountAssoc() {
        return userAccountAssoc;
    }

    public void setUserAccountAssoc(UserAccount userAccountAssoc) {
        this.userAccountAssoc = userAccountAssoc;
    }
    
    public PharmacyCatalogOrganization(String pharmacyName, EcoSystem system) {
        super(Organization.Type.PharmacyCatalog.getValue());
        this.pharmacyName = pharmacyName;
        
        Employee employee = system.getEmployeeDirectory().createEmployee(pharmacyName);
        this.userAccountAssoc = system.getUserAccountDirectory().createUserAccount(pharmacyName.replaceAll("\\s", ""), "pharmacyCatalog", employee, new PharmacistRole());
        
        this.medicineDirectory = medicineDirectory;
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new PharmacistRole());
        return roles;
    }
}