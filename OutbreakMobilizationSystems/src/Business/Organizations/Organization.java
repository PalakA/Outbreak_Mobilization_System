///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
package Business.Organizations;


import Business.Employee.EmployeeDirectory;
import Business.Roles.Roles;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/12/2021            @author palak       Added Organization
 * 04/13/2021            @author palak       Added enum Types
 * 04/14/2021            @author palak       Added getSuuportedRole function
 */

public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    public ArrayList<Roles> roles;
    private static int counter=0;
    
    public enum Type{
        Admin("Administration Organization"), Hospital("HospitalInventory Organization"), Laboratories("Laboratories Organization"),
        Manufacturer("Manufacturer Organization"), PharmacyCatalog("PharmacyCatalog Organization"), PharmacyDistribution("PharmacyDistribution Organization"),
        SampleCollections("SampleCollections Organization"), SupplyChain("SupplyChain Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        roles = new ArrayList<Roles>();
        ++counter;
    }

    public abstract ArrayList<Roles> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

}